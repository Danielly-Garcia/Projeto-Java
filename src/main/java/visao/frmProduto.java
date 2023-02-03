
package visao;

import controle.FornecedoresDAO;
import controle.ProdutosDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Fornecedores;
import modelo.Produtos;
import modelo.Utilitarios;


public class frmProduto extends javax.swing.JFrame {

    
    public void listar(){
        
        ProdutosDAO dao = new ProdutosDAO();
        List<Produtos> lista = dao.listarProdutos();
        
        DefaultTableModel dados = (DefaultTableModel) tbProduto.getModel();
        dados.setNumRows(0);
        
        for(Produtos p: lista) {
            dados.addRow(new Object[] {
                    p.getId(),
                    p.getDescricao(),
                    p.getPreco(),
                    p.getQtd_estoque(),
                    p.getFornecedor().getNome()
                    });
        }
    }

   
    public frmProduto() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tb = new javax.swing.JTabbedPane();
        painel_dados = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        txtFornecedor = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtQtEstoque = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        cbFornecedores = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        btnPesqusiaCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProduto = new javax.swing.JTable();
        btNovo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();

        jLabel17.setText("jLabel17");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setBackground(new java.awt.Color(51, 255, 204));
        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 0, 54)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de Produto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        painel_dados.setBackground(new java.awt.Color(255, 255, 255));
        painel_dados.setName(""); // NOI18N
        painel_dados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painel_dadosMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("ID produto");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Produto:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Preço:");

        txtProduto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtProduto.setName("txtProduto"); // NOI18N

        txtPreco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPreco.setName("txtPreco"); // NOI18N

        txtFornecedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFornecedor.setText("Fornecedor");
        txtFornecedor.setName("txtFonecedor"); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Quantidade Estoque:");

        txtQtEstoque.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtQtEstoque.setName("txtQtEstoque"); // NOI18N
        txtQtEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtEstoqueActionPerformed(evt);
            }
        });

        txtId.setEditable(false);
        txtId.setName("txtId"); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        cbFornecedores.setName("cbFornecedores"); // NOI18N
        cbFornecedores.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cbFornecedoresAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        cbFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFornecedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_dadosLayout = new javax.swing.GroupLayout(painel_dados);
        painel_dados.setLayout(painel_dadosLayout);
        painel_dadosLayout.setHorizontalGroup(
            painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dadosLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_dadosLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painel_dadosLayout.createSequentialGroup()
                        .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painel_dadosLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(painel_dadosLayout.createSequentialGroup()
                                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtQtEstoque))))
                            .addGroup(painel_dadosLayout.createSequentialGroup()
                                .addComponent(txtFornecedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(43, Short.MAX_VALUE))))
        );
        painel_dadosLayout.setVerticalGroup(
            painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dadosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtQtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFornecedor)
                    .addComponent(cbFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        tb.addTab("Dados do Produto", painel_dados);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Nome");

        txtPesquisa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPesquisa.setName(""); // NOI18N
        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisa(evt);
            }
        });
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyPressed(evt);
            }
        });

        btnPesqusiaCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPesqusiaCliente.setText("Pesquisar");
        btnPesqusiaCliente.setName("btnPesquisaCliente"); // NOI18N
        btnPesqusiaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPesqusiaClienteMouseClicked(evt);
            }
        });
        btnPesqusiaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqusiaClienteActionPerformed(evt);
            }
        });

        tbProduto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Produto", "Descrição", "Preço", "Quantidade Estoque", "Fornecedor"
            }
        ));
        tbProduto.setName("tbProduto"); // NOI18N
        tbProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProdutoMouseClicked(evt);
            }
        });
        tbProduto.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                tbProdutoInputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(tbProduto);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesqusiaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 125, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesqusiaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        tb.addTab("Consulta de Produtos", jPanel3);

        btNovo.setBackground(new java.awt.Color(102, 102, 102));
        btNovo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btNovo.setForeground(new java.awt.Color(255, 255, 255));
        btNovo.setText("Novo");
        btNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btNovoMouseClicked(evt);
            }
        });
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovo(evt);
            }
        });

        btSalvar.setBackground(new java.awt.Color(102, 102, 102));
        btSalvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btSalvar.setText("Salvar");
        btSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSalvarMouseClicked(evt);
            }
        });
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btEditar.setBackground(new java.awt.Color(102, 102, 102));
        btEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btEditar.setForeground(new java.awt.Color(255, 255, 255));
        btEditar.setText("Editar");
        btEditar.setName("btEditar"); // NOI18N
        btEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEditarMouseClicked(evt);
            }
        });
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btExcluir.setBackground(new java.awt.Color(102, 102, 102));
        btExcluir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btExcluir.setText("Excluir");
        btExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btExcluirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tb, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btNovo)
                .addGap(61, 61, 61)
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(btEditar)
                .addGap(59, 59, 59)
                .addComponent(btExcluir)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tb, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisa(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisa
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisa

    private void btnPesqusiaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqusiaClienteActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnPesqusiaClienteActionPerformed

    private void btNovo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovo
        // TODO add your handling code here:
    }//GEN-LAST:event_btNovo

    private void btSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalvarMouseClicked
        // TODO add your handling code here:
       Produtos obj = new Produtos();
        
        obj.setDescricao(txtProduto.getText());
        obj.setPreco(Double.parseDouble(txtPreco.getText()));
        obj.setQtd_estoque(Integer.parseInt(txtQtEstoque.getText()));
        
        Fornecedores f = new Fornecedores();
        f = (Fornecedores) cbFornecedores.getSelectedItem();
        
        obj.setFornecedor(f);
        
        ProdutosDAO dao = new ProdutosDAO();
        
        dao.cadastrarProdutos(obj);
        
        new Utilitarios().LimparTela(painel_dados);
    }//GEN-LAST:event_btSalvarMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       listar();
        
    }//GEN-LAST:event_formWindowActivated

    private void btExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExcluirMouseClicked
        // TODO add your handling code here:
       Produtos obj = new Produtos();
        
       obj.setId(Integer.parseInt(txtId.getText()));
   
        ProdutosDAO dao = new   ProdutosDAO();
        
        dao.excluirProdutos(obj);
        
        new Utilitarios().LimparTela(painel_dados);
       
    }//GEN-LAST:event_btExcluirMouseClicked

    private void btEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEditarMouseClicked
        // TODO add your handling code here:
     
        Produtos obj = new Produtos();
        
       obj.setId(Integer.parseInt(txtId.getText()));
       obj.setDescricao(txtProduto.getText());
       obj.setPreco(Double.parseDouble(txtPreco.getText()));
       obj.setQtd_estoque(Integer.parseInt(txtQtEstoque.getText()));
       
       Fornecedores f = new Fornecedores();
       f = (Fornecedores) cbFornecedores.getSelectedItem();
        
        obj.setFornecedor(f);
        
        ProdutosDAO dao = new ProdutosDAO();
        dao.alterarProdutos(obj);
        
        new Utilitarios().LimparTela(painel_dados);
        
    }//GEN-LAST:event_btEditarMouseClicked

    private void tbProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProdutoMouseClicked
        // TODO add your handling code here:
       
        tb.setSelectedIndex(0);
    
        txtId.setText(tbProduto.getValueAt(tbProduto.getSelectedRow(),0).toString());
        txtProduto.setText(tbProduto.getValueAt(tbProduto.getSelectedRow(),1).toString());
        txtPreco.setText(tbProduto.getValueAt(tbProduto.getSelectedRow(),2).toString());
        txtQtEstoque.setText(tbProduto.getValueAt(tbProduto.getSelectedRow(),3).toString());
        
         Fornecedores f = new Fornecedores();
        FornecedoresDAO dao = new FornecedoresDAO();
        
        f = dao.ConsultaPorNome(tbProduto.getValueAt(tbProduto.getSelectedRow(),4).toString());
        
        cbFornecedores.removeAllItems();
        cbFornecedores.getModel().setSelectedItem(f);
        
    }//GEN-LAST:event_tbProdutoMouseClicked

    private void btnPesqusiaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesqusiaClienteMouseClicked
        // TODO add your handling code here:
       String nome = "%" + txtPesquisa.getText() + "%";
        ProdutosDAO dao = new ProdutosDAO();
        List<Produtos> lista = dao.listarProdutosPorNome(nome);
        
        DefaultTableModel dados = (DefaultTableModel)tbProduto.getModel();
        dados.setNumRows(0);
        
        for(Produtos p: lista) {
            dados.addRow(new Object[] {
                p.getId(),
                p.getDescricao(),
                p.getPreco(),
                p.getQtd_estoque(),
                p.getFornecedor().getNome()
            });
        }
    }//GEN-LAST:event_btnPesqusiaClienteMouseClicked

    private void txtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyPressed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txtPesquisaKeyPressed

    private void btNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNovoMouseClicked
        // TODO add your handling code here:
        //new Utilitarios().LimparTela(painel_dados);
    }//GEN-LAST:event_btNovoMouseClicked

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSalvarActionPerformed

    private void tbProdutoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tbProdutoInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tbProdutoInputMethodTextChanged

    private void cbFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFornecedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFornecedoresActionPerformed

    private void cbFornecedoresAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbFornecedoresAncestorAdded
        // TODO add your handling code here:
       FornecedoresDAO dao = new FornecedoresDAO();
        List<Fornecedores> listadefornecedores = dao.listarFornecedores();
        
        cbFornecedores.removeAll();
        
        for(Fornecedores f: listadefornecedores) {
            cbFornecedores.addItem(f);
        }
    }//GEN-LAST:event_cbFornecedoresAncestorAdded

    private void txtQtEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtEstoqueActionPerformed

    private void painel_dadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painel_dadosMouseClicked
        // TODO add your handling code here:
     
    }//GEN-LAST:event_painel_dadosMouseClicked

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEditarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btnPesqusiaCliente;
    private javax.swing.JComboBox cbFornecedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painel_dados;
    private javax.swing.JTabbedPane tb;
    private javax.swing.JTable tbProduto;
    private javax.swing.JLabel txtFornecedor;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtQtEstoque;
    // End of variables declaration//GEN-END:variables
}
