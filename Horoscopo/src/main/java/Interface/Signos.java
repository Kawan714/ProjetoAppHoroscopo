/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import java.awt.Image;
import java.time.LocalDate;
import javax.swing.ImageIcon;

/**
 *
 * @author KawanDantas
 */
public class Signos extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Signos.class.getName());

    /**
     * Creates new form Signos
     */
    public Signos() {
        initComponents();
        RedimensionarImagens();
    }

    // TODA A FUNÇÃO É CRIADA ABAIXO DO CONSTRUTOR
    
    public void RedimensionarImagens(){
        // capturar as imagens que estão dentro da label
        ImageIcon aries = (ImageIcon) imgSignoAries.getIcon();
        ImageIcon touro = (ImageIcon) imgSignoTouro.getIcon();
        ImageIcon gemeos  = (ImageIcon) imgSignoGemeos.getIcon();
        ImageIcon cancer = (ImageIcon) imgSignoCancer.getIcon();
        ImageIcon libra = (ImageIcon) imgSignoLibra.getIcon();
        ImageIcon escorpiao = (ImageIcon) imgSignoEscorpiao.getIcon();
        ImageIcon sagitario = (ImageIcon) imgSignoSagitario.getIcon();
        ImageIcon capricornio = (ImageIcon) imgSignoCapricornio.getIcon();
        ImageIcon aquario = (ImageIcon) imgSignoAquario.getIcon();
        ImageIcon peixes = (ImageIcon) imgSignoPeixes.getIcon();
        ImageIcon virgem = (ImageIcon) imgSignoVirgem.getIcon();
        ImageIcon leao = (ImageIcon) imgSignoLeao.getIcon();
        
        // redimensionar o tamanho delas
        Image imgAries = aries.getImage().getScaledInstance(300, 400, Image.SCALE_SMOOTH);
        Image imgTouro = touro.getImage().getScaledInstance(300, 400, Image.SCALE_SMOOTH);
        Image imgGemeos = gemeos.getImage().getScaledInstance(300, 400, Image.SCALE_SMOOTH);
        Image imgCancer = cancer.getImage().getScaledInstance(300, 400, Image.SCALE_SMOOTH);
        Image imgLibra = libra.getImage().getScaledInstance(300, 400, Image.SCALE_SMOOTH);
        Image imgEscorpiao = escorpiao.getImage().getScaledInstance(300, 400, Image.SCALE_SMOOTH);
        Image imgSagitario = sagitario.getImage().getScaledInstance(300, 400, Image.SCALE_SMOOTH);
        Image imgCapricornio = capricornio.getImage().getScaledInstance(300, 400, Image.SCALE_SMOOTH);
        Image imgAquario = aquario.getImage().getScaledInstance(300, 400, Image.SCALE_SMOOTH);
        Image imgPeixes = peixes.getImage().getScaledInstance(300, 400, Image.SCALE_SMOOTH);
        Image imgVirgem = virgem.getImage().getScaledInstance(300, 400, Image.SCALE_SMOOTH);
        Image imgLeao = leao.getImage().getScaledInstance(300, 400, Image.SCALE_SMOOTH);
        
        // JOGAR A IMAGEM REDIMENSIONADA NA LABEL NOVAMENTE
        imgSignoAries.setIcon(new ImageIcon (imgAries));
        imgSignoTouro.setIcon(new ImageIcon (imgTouro));
        imgSignoGemeos.setIcon(new ImageIcon (imgGemeos));
        imgSignoCancer.setIcon(new ImageIcon (imgCancer));
        imgSignoLibra.setIcon(new ImageIcon (imgLibra));
        imgSignoEscorpiao.setIcon(new ImageIcon (imgEscorpiao));
        imgSignoSagitario.setIcon(new ImageIcon (imgSagitario));
        imgSignoCapricornio.setIcon(new ImageIcon (imgCapricornio));
        imgSignoAquario.setIcon(new ImageIcon (imgAquario));
        imgSignoPeixes.setIcon(new ImageIcon (imgPeixes));
        imgSignoVirgem.setIcon(new ImageIcon (imgVirgem));
        imgSignoLeao.setIcon(new ImageIcon (imgLeao));
        
    }// fim da função
    
    
    public void PreencherPrevisao(){
        // verificar o dia da semana
        // LocalDate - puxa a data do computador
        int diaSemana = LocalDate.now().getDayOfWeek().getValue();
        
        // CRIAR A CONDICIONAL PARA PREENCHER O CAMPO PREVISAO.
        switch (diaSemana) {

    case 1: // Segunda-feira
        txtPrevisaoAries.setText("Previsão de Áries para segunda-feira");
        txtPrevisaoTouro.setText("Previsão de Touro para segunda-feira");
        txtPrevisaoGemeos.setText("Previsão de Gêmeos para segunda-feira");
        txtPrevisaoCancer.setText("Previsão de Câncer para segunda-feira");
        txtPrevisaoLeao.setText("Previsão de Leão para segunda-feira");
        txtPrevisaoVirgem.setText("Previsão de Virgem para segunda-feira");
        txtPrevisaoLibra.setText("Previsão de Libra para segunda-feira");
        txPrevisaoEscorpiao.setText("Previsão de Escorpião para segunda-feira");
        txPrevisaoSagitario.setText("Previsão de Sagitário para segunda-feira");
        txPrevisaoCapricornio.setText("Previsão de Capricórnio para segunda-feira");
        txPrevisaoAquario.setText("Previsão de Aquário para segunda-feira");
        txPrevisaoPeixes.setText("Previsão de Peixes para segunda-feira");
        break;

    case 2: // Terça-feira
        txPrevisaoAries1.setText("Previsão de Áries para terça-feira");
        txPrevisaoTouro.setText("Previsão de Touro para terça-feira");
        txPrevisaoGemeos.setText("Previsão de Gêmeos para terça-feira");
        txPrevisaoCancer.setText("Previsão de Câncer para terça-feira");
        txPrevisaoLeao.setText("Previsão de Leão para terça-feira");
        txPrevisaoVirgem.setText("Previsão de Virgem para terça-feira");
        txPrevisaoLibra.setText("Previsão de Libra para terça-feira");
        txPrevisaoEscorpiao.setText("Previsão de Escorpião para terça-feira");
        txPrevisaoSagitario.setText("Previsão de Sagitário para terça-feira");
        txPrevisaoCapricornio.setText("Previsão de Capricórnio para terça-feira");
        txPrevisaoAquario.setText("Previsão de Aquário para terça-feira");
        txPrevisaoPeixes.setText("Previsão de Peixes para terça-feira");
        break;

    case 3: // Quarta-feira
        txPrevisaoAries1.setText("Previsão de Áries para quarta-feira");
        txPrevisaoTouro.setText("Previsão de Touro para quarta-feira");
        txPrevisaoGemeos.setText("Previsão de Gêmeos para quarta-feira");
        txPrevisaoCancer.setText("Previsão de Câncer para quarta-feira");
        txPrevisaoLeao.setText("Previsão de Leão para quarta-feira");
        txPrevisaoVirgem.setText("Previsão de Virgem para quarta-feira");
        txPrevisaoLibra.setText("Previsão de Libra para quarta-feira");
        txPrevisaoEscorpiao.setText("Previsão de Escorpião para quarta-feira");
        txPrevisaoSagitario.setText("Previsão de Sagitário para quarta-feira");
        txPrevisaoCapricornio.setText("Previsão de Capricórnio para quarta-feira");
        txPrevisaoAquario.setText("Previsão de Aquário para quarta-feira");
        txPrevisaoPeixes.setText("Previsão de Peixes para quarta-feira");
        break;

    case 4: // Quinta-feira
        txPrevisaoAries1.setText("Previsão de Áries para quinta-feira");
        txPrevisaoTouro.setText("Previsão de Touro para quinta-feira");
        txPrevisaoGemeos.setText("Previsão de Gêmeos para quinta-feira");
        txPrevisaoCancer.setText("Previsão de Câncer para quinta-feira");
        txPrevisaoLeao.setText("Previsão de Leão para quinta-feira");
        txPrevisaoVirgem.setText("Previsão de Virgem para quinta-feira");
        txPrevisaoLibra.setText("Previsão de Libra para quinta-feira");
        txPrevisaoEscorpiao.setText("Previsão de Escorpião para quinta-feira");
        txPrevisaoSagitario.setText("Previsão de Sagitário para quinta-feira");
        txPrevisaoCapricornio.setText("Previsão de Capricórnio para quinta-feira");
        txPrevisaoAquario.setText("Previsão de Aquário para quinta-feira");
        txPrevisaoPeixes.setText("Previsão de Peixes para quinta-feira");
        break;

    case 5: // Sexta-feira
        txPrevisaoAries1.setText("Previsão de Áries para sexta-feira");
        txPrevisaoTouro.setText("Previsão de Touro para sexta-feira");
        txPrevisaoGemeos.setText("Previsão de Gêmeos para sexta-feira");
        txPrevisaoCancer.setText("Previsão de Câncer para sexta-feira");
        txPrevisaoLeao.setText("Previsão de Leão para sexta-feira");
        txPrevisaoVirgem.setText("Previsão de Virgem para sexta-feira");
        txPrevisaoLibra.setText("Previsão de Libra para sexta-feira");
        txPrevisaoEscorpiao.setText("Previsão de Escorpião para sexta-feira");
        txPrevisaoSagitario.setText("Previsão de Sagitário para sexta-feira");
        txPrevisaoCapricornio.setText("Previsão de Capricórnio para sexta-feira");
        txPrevisaoAquario.setText("Previsão de Aquário para sexta-feira");
        txPrevisaoPeixes.setText("Previsão de Peixes para sexta-feira");
        break;

    case 6: // Sábado
        txPrevisaoAries1.setText("Previsão de Áries para sábado");
        txPrevisaoTouro.setText("Previsão de Touro para sábado");
        txPrevisaoGemeos.setText("Previsão de Gêmeos para sábado");
        txPrevisaoCancer.setText("Previsão de Câncer para sábado");
        txPrevisaoLeao.setText("Previsão de Leão para sábado");
        txPrevisaoVirgem.setText("Previsão de Virgem para sábado");
        txPrevisaoLibra.setText("Previsão de Libra para sábado");
        txPrevisaoEscorpiao.setText("Previsão de Escorpião para sábado");
        txPrevisaoSagitario.setText("Previsão de Sagitário para sábado");
        txPrevisaoCapricornio.setText("Previsão de Capricórnio para sábado");
        txPrevisaoAquario.setText("Previsão de Aquário para sábado");
        txPrevisaoPeixes.setText("Previsão de Peixes para sábado");
        break;

    case 7: // Domingo
        txPrevisaoAries1.setText("Previsão de Áries para domingo");
        txPrevisaoTouro.setText("Previsão de Touro para domingo");
        txPrevisaoGemeos.setText("Previsão de Gêmeos para domingo");
        txPrevisaoCancer.setText("Previsão de Câncer para domingo");
        txPrevisaoLeao.setText("Previsão de Leão para domingo");
        txPrevisaoVirgem.setText("Previsão de Virgem para domingo");
        txPrevisaoLibra.setText("Previsão de Libra para domingo");
        txPrevisaoEscorpiao.setText("Previsão de Escorpião para domingo");
        txPrevisaoSagitario.setText("Previsão de Sagitário para domingo");
        txPrevisaoCapricornio.setText("Previsão de Capricórnio para domingo");
        txPrevisaoAquario.setText("Previsão de Aquário para domingo");
        txPrevisaoPeixes.setText("Previsão de Peixes para domingo");
        break;
}
        
    }
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areasAbas = new javax.swing.JTabbedPane();
        inicio = new javax.swing.JPanel();
        areaCompatibilidade = new javax.swing.JPanel();
        tituloCompatibilidade = new javax.swing.JLabel();
        Signo1 = new javax.swing.JLabel();
        Signo2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        btnCalcular = new javax.swing.JToggleButton();
        areaDescobrirSigno = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        cbDia = new javax.swing.JComboBox<>();
        cbMes = new javax.swing.JComboBox<>();
        btnDescobrirSigno = new javax.swing.JButton();
        areaRsultado = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSigno = new javax.swing.JButton();
        tfCompatibilidade = new javax.swing.JPanel();
        fundoinicio = new javax.swing.JLabel();
        fundoaries = new javax.swing.JPanel();
        areaInformacoes = new javax.swing.JPanel();
        imgSignoAries = new javax.swing.JLabel();
        tituloAries = new javax.swing.JLabel();
        periodoAries = new javax.swing.JLabel();
        elementoAries = new javax.swing.JLabel();
        planetaAries = new javax.swing.JLabel();
        corAries = new javax.swing.JLabel();
        numeroAries = new javax.swing.JLabel();
        tfPeriodoAries = new javax.swing.JTextField();
        tfElementosAries = new javax.swing.JTextField();
        tfPlanetaAries = new javax.swing.JTextField();
        tfCorAries = new javax.swing.JTextField();
        tfNumeroAries = new javax.swing.JTextField();
        areaCaracteristicas = new javax.swing.JPanel();
        tituloCaracterísticas = new javax.swing.JLabel();
        pfortesAries = new javax.swing.JLabel();
        pMelhoriasAries = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txFortesAries = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txMelhorarAries = new javax.swing.JTextArea();
        areaPrevisoes = new javax.swing.JPanel();
        areaPrevisao = new javax.swing.JLabel();
        btnAtualizarPrevisaoAries = new javax.swing.JButton();
        txtPrevis = new javax.swing.JScrollPane();
        txtPrevisaoAries = new javax.swing.JTextArea();
        areaEnergia = new javax.swing.JPanel();
        tituloEnergiaAries = new javax.swing.JLabel();
        amorAries = new javax.swing.JLabel();
        tfAmorAries = new javax.swing.JTextField();
        trabalhoAries = new javax.swing.JLabel();
        tfTrabalhoAries = new javax.swing.JTextField();
        saudeAries = new javax.swing.JLabel();
        tfSaudeAries = new javax.swing.JTextField();
        sorteAries = new javax.swing.JLabel();
        tfSorteAries = new javax.swing.JTextField();
        areaMensagem = new javax.swing.JPanel();
        tituloMensagemAries = new javax.swing.JLabel();
        btnCopiarMsgAries = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMensagemAries = new javax.swing.JTextArea();
        fundoAries = new javax.swing.JLabel();
        txPrevisaoAries = new javax.swing.JScrollPane();
        jTextField1 = new javax.swing.JTextField();
        fundoTouro = new javax.swing.JPanel();
        areaPrevisoes1 = new javax.swing.JPanel();
        areaPrevisao1 = new javax.swing.JLabel();
        btnAtualizarPrevisaoTouro = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtPrevisaoTouro = new javax.swing.JTextArea();
        areaInformacoes1 = new javax.swing.JPanel();
        imgSignoTouro = new javax.swing.JLabel();
        tituloTouro = new javax.swing.JLabel();
        periodoTouro = new javax.swing.JLabel();
        elementoTouro = new javax.swing.JLabel();
        planetaTouro = new javax.swing.JLabel();
        corTouro = new javax.swing.JLabel();
        numeroTouro = new javax.swing.JLabel();
        tfPeriodoTouro = new javax.swing.JTextField();
        tfElementosTouro = new javax.swing.JTextField();
        tfPlanetaTouro = new javax.swing.JTextField();
        tfCorTouro = new javax.swing.JTextField();
        tfNumeroTouro = new javax.swing.JTextField();
        areaCaracteristicas1 = new javax.swing.JPanel();
        tituloCaracterísticas1 = new javax.swing.JLabel();
        pfortesTouro = new javax.swing.JLabel();
        pMelhoriasTouro = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txFortesTouro = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txMelhorarTouro = new javax.swing.JTextArea();
        areaEnergia1 = new javax.swing.JPanel();
        tituloEnergiaTouro = new javax.swing.JLabel();
        amorTouro = new javax.swing.JLabel();
        tfAmorTouro = new javax.swing.JTextField();
        trabalhoTouro = new javax.swing.JLabel();
        tfTrabalhoTouro = new javax.swing.JTextField();
        saudeTouro = new javax.swing.JLabel();
        tfSaudeTouro = new javax.swing.JTextField();
        sorteTouro = new javax.swing.JLabel();
        tfSorteTouro = new javax.swing.JTextField();
        areaMensagem1 = new javax.swing.JPanel();
        tituloMensagemTouro = new javax.swing.JLabel();
        btnCopiarMsgTouro = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtMensagemTouro = new javax.swing.JTextArea();
        fundotouro = new javax.swing.JLabel();
        fundoGemeos = new javax.swing.JPanel();
        areaPrevisoes2 = new javax.swing.JPanel();
        areaPrevisao2 = new javax.swing.JLabel();
        btnAtualizarPrevisaoGemeos = new javax.swing.JButton();
        txPrevisaoGemeos = new javax.swing.JScrollPane();
        areaInformacoes2 = new javax.swing.JPanel();
        imgSignoGemeos = new javax.swing.JLabel();
        tituloGemeos = new javax.swing.JLabel();
        periodoGemeos = new javax.swing.JLabel();
        elementoGemeos = new javax.swing.JLabel();
        planetaGemeos = new javax.swing.JLabel();
        corGemeos = new javax.swing.JLabel();
        numeroGemeos = new javax.swing.JLabel();
        tfPeriodoGemeos = new javax.swing.JTextField();
        tfElementosGemeos = new javax.swing.JTextField();
        tfPlanetaGemeos = new javax.swing.JTextField();
        tfCorGemeos = new javax.swing.JTextField();
        tfNumeroGemeos = new javax.swing.JTextField();
        areaCaracteristicas2 = new javax.swing.JPanel();
        tituloCaracterísticas2 = new javax.swing.JLabel();
        pfortesGemeos = new javax.swing.JLabel();
        pMelhoriasGemeos = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txFortesGemeos = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        txMelhorarGemeos = new javax.swing.JTextArea();
        areaEnergia2 = new javax.swing.JPanel();
        tituloEnergiaGemeos = new javax.swing.JLabel();
        amorGemeos = new javax.swing.JLabel();
        tfAmorGemeos = new javax.swing.JTextField();
        trabalhoGemeos = new javax.swing.JLabel();
        tfTrabalhoGemeos = new javax.swing.JTextField();
        saudeGemeos = new javax.swing.JLabel();
        tfSaudeGemeos = new javax.swing.JTextField();
        sorteGemeos = new javax.swing.JLabel();
        tfSorteGemeos = new javax.swing.JTextField();
        areaMensagem2 = new javax.swing.JPanel();
        tituloMensagemGemeos = new javax.swing.JLabel();
        txMensagemGemeos = new javax.swing.JScrollPane();
        btnCopiarMsgGemeos = new javax.swing.JButton();
        fundogemeos = new javax.swing.JLabel();
        fundoCancer = new javax.swing.JPanel();
        areaPrevisoes3 = new javax.swing.JPanel();
        areaPrevisao3 = new javax.swing.JLabel();
        btnAtualizarPrevisaoCancer = new javax.swing.JButton();
        txPrevisaoCancer = new javax.swing.JScrollPane();
        areaInformacoes3 = new javax.swing.JPanel();
        imgSignoCancer = new javax.swing.JLabel();
        tituloCancer = new javax.swing.JLabel();
        periodoCancer = new javax.swing.JLabel();
        elementoCancer = new javax.swing.JLabel();
        planetaCancer = new javax.swing.JLabel();
        corCancer = new javax.swing.JLabel();
        numeroCancer = new javax.swing.JLabel();
        tfPeriodoCancer = new javax.swing.JTextField();
        tfElementosCancer = new javax.swing.JTextField();
        tfPlanetaCancer = new javax.swing.JTextField();
        tfCorCancer = new javax.swing.JTextField();
        tfNumeroCancer = new javax.swing.JTextField();
        areaCaracteristicas3 = new javax.swing.JPanel();
        tituloCaracterísticas3 = new javax.swing.JLabel();
        pfortesCancer = new javax.swing.JLabel();
        pMelhoriasCancer = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txFortesCancer = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        txMelhorarCancer = new javax.swing.JTextArea();
        areaEnergia3 = new javax.swing.JPanel();
        tituloEnergiaCancer = new javax.swing.JLabel();
        amorCancer = new javax.swing.JLabel();
        tfAmorCancer = new javax.swing.JTextField();
        trabalhoCancer = new javax.swing.JLabel();
        tfTrabalhoCancer = new javax.swing.JTextField();
        saudeCancer = new javax.swing.JLabel();
        tfSaudeCancer = new javax.swing.JTextField();
        sorteCancer = new javax.swing.JLabel();
        tfSorteCancer = new javax.swing.JTextField();
        areaMensagem3 = new javax.swing.JPanel();
        tituloMensagemCancer = new javax.swing.JLabel();
        txMensagemCancer = new javax.swing.JScrollPane();
        btnCopiarMsgCancer = new javax.swing.JButton();
        fundocancer = new javax.swing.JLabel();
        fundoLibra = new javax.swing.JPanel();
        areaPrevisoes6 = new javax.swing.JPanel();
        areaPrevisao6 = new javax.swing.JLabel();
        btnAtualizarPrevisaoLibra = new javax.swing.JButton();
        txPrevisaoLibra = new javax.swing.JScrollPane();
        areaInformacoes6 = new javax.swing.JPanel();
        imgSignoLibra = new javax.swing.JLabel();
        tituloLibra = new javax.swing.JLabel();
        periodoLibra = new javax.swing.JLabel();
        elementoLibra = new javax.swing.JLabel();
        planetaLibra = new javax.swing.JLabel();
        corLibra = new javax.swing.JLabel();
        numeroLibra = new javax.swing.JLabel();
        tfPeriodoLibra = new javax.swing.JTextField();
        tfElementosLibra = new javax.swing.JTextField();
        tfPlanetaLibra = new javax.swing.JTextField();
        tfCorLibra = new javax.swing.JTextField();
        tfNumeroLibra = new javax.swing.JTextField();
        areaCaracteristicas6 = new javax.swing.JPanel();
        tituloCaracterísticas6 = new javax.swing.JLabel();
        pfortesLibra = new javax.swing.JLabel();
        pMelhoriasLibra = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        txFortesLibra = new javax.swing.JTextArea();
        jScrollPane15 = new javax.swing.JScrollPane();
        txMelhorarLibra = new javax.swing.JTextArea();
        areaEnergia6 = new javax.swing.JPanel();
        tituloEnergiaLibra = new javax.swing.JLabel();
        amorLibra = new javax.swing.JLabel();
        tfAmorLibra = new javax.swing.JTextField();
        trabalhoLibra = new javax.swing.JLabel();
        tfTrabalhoLibra = new javax.swing.JTextField();
        saudeLibra = new javax.swing.JLabel();
        tfSaudeLibra = new javax.swing.JTextField();
        sorteLibra = new javax.swing.JLabel();
        tfSorteLibra = new javax.swing.JTextField();
        areaMensagem6 = new javax.swing.JPanel();
        tituloMensagemLibra = new javax.swing.JLabel();
        txMensagemLibra = new javax.swing.JScrollPane();
        btnCopiarMsgLibra = new javax.swing.JButton();
        fundolibra = new javax.swing.JLabel();
        fundoEscorpião = new javax.swing.JPanel();
        areaPrevisoes7 = new javax.swing.JPanel();
        areaPrevisao7 = new javax.swing.JLabel();
        btnAtualizarPrevisaoEscorpiao = new javax.swing.JButton();
        txPrevisaoEscorpiao = new javax.swing.JScrollPane();
        areaInformacoes7 = new javax.swing.JPanel();
        imgSignoEscorpiao = new javax.swing.JLabel();
        tituloEscorpiao = new javax.swing.JLabel();
        periodoEscorpiao = new javax.swing.JLabel();
        elementoEscorpiao = new javax.swing.JLabel();
        planetaEscorpiao = new javax.swing.JLabel();
        corEscorpiao = new javax.swing.JLabel();
        numeroEscorpiao = new javax.swing.JLabel();
        tfPeriodoEscorpiao = new javax.swing.JTextField();
        tfElementosEscorpiao = new javax.swing.JTextField();
        tfPlanetaEscorpiao = new javax.swing.JTextField();
        tfCorEscorpiao = new javax.swing.JTextField();
        tfNumeroEscorpiao = new javax.swing.JTextField();
        areaCaracteristicas7 = new javax.swing.JPanel();
        tituloCaracterísticas7 = new javax.swing.JLabel();
        pfortesEscorpiao = new javax.swing.JLabel();
        pMelhoriasEscorpiao = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        txFortesEscorpiao = new javax.swing.JTextArea();
        jScrollPane17 = new javax.swing.JScrollPane();
        txMelhorarEscorpiao = new javax.swing.JTextArea();
        areaEnergia7 = new javax.swing.JPanel();
        tituloEnergiaEscorpiao = new javax.swing.JLabel();
        amorEscorpiao = new javax.swing.JLabel();
        tfAmorEscorpiao = new javax.swing.JTextField();
        trabalhoEscorpiao = new javax.swing.JLabel();
        tfTrabalhoEscorpiao = new javax.swing.JTextField();
        saudeEscorpiao = new javax.swing.JLabel();
        tfSaudeEsorpiao = new javax.swing.JTextField();
        sorteEscorpiao = new javax.swing.JLabel();
        tfSorteEscorpiao = new javax.swing.JTextField();
        areaMensagem7 = new javax.swing.JPanel();
        tituloMensagemEscorpiao = new javax.swing.JLabel();
        txMensagemEscorpiao = new javax.swing.JScrollPane();
        btnCopiarMsgEscorpiao = new javax.swing.JButton();
        fundoescorpiao = new javax.swing.JLabel();
        fundoSagitario = new javax.swing.JPanel();
        areaPrevisoes8 = new javax.swing.JPanel();
        areaPrevisao8 = new javax.swing.JLabel();
        btnAtualizarPrevisaoSagitario = new javax.swing.JButton();
        txPrevisaoSagitario = new javax.swing.JScrollPane();
        areaInformacoes8 = new javax.swing.JPanel();
        imgSignoSagitario = new javax.swing.JLabel();
        tituloSagitario = new javax.swing.JLabel();
        periodoSagitario = new javax.swing.JLabel();
        elementoSagitario = new javax.swing.JLabel();
        planetaSagitario = new javax.swing.JLabel();
        corSagitario = new javax.swing.JLabel();
        numeroSagitario = new javax.swing.JLabel();
        tfPeriodoSagitario = new javax.swing.JTextField();
        tfElementosSagitario = new javax.swing.JTextField();
        tfPlanetaSagitario = new javax.swing.JTextField();
        tfCorSagitario = new javax.swing.JTextField();
        tfNumeroSagitario = new javax.swing.JTextField();
        areaCaracteristicas8 = new javax.swing.JPanel();
        tituloCaracterísticas8 = new javax.swing.JLabel();
        pfortesSagitario = new javax.swing.JLabel();
        pMelhoriasSagitario = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        txFortesSagitario = new javax.swing.JTextArea();
        jScrollPane19 = new javax.swing.JScrollPane();
        txMelhorarSagitario = new javax.swing.JTextArea();
        areaEnergia8 = new javax.swing.JPanel();
        tituloEnergiaSagitario = new javax.swing.JLabel();
        amorSagitario = new javax.swing.JLabel();
        tfAmorSagitario = new javax.swing.JTextField();
        trabalhoSagitario = new javax.swing.JLabel();
        tfTrabalhoSagitario = new javax.swing.JTextField();
        saudeSagitario = new javax.swing.JLabel();
        tfSaudeSagitario = new javax.swing.JTextField();
        sorteSagitario = new javax.swing.JLabel();
        tfSorteSagitario = new javax.swing.JTextField();
        areaMensagem8 = new javax.swing.JPanel();
        tituloMensagemSagitario = new javax.swing.JLabel();
        txMensagemSagitario = new javax.swing.JScrollPane();
        btnCopiarMsgSagitario = new javax.swing.JButton();
        fundosagitario = new javax.swing.JLabel();
        fundoCapricornio = new javax.swing.JPanel();
        areaPrevisoes9 = new javax.swing.JPanel();
        areaPrevisao9 = new javax.swing.JLabel();
        btnAtualizarPrevisaoCapricornio = new javax.swing.JButton();
        txPrevisaoCapricornio = new javax.swing.JScrollPane();
        areaInformacoes9 = new javax.swing.JPanel();
        imgSignoCapricornio = new javax.swing.JLabel();
        tituloCapricornio = new javax.swing.JLabel();
        periodoCapricornio = new javax.swing.JLabel();
        elementoCapricornio = new javax.swing.JLabel();
        planetaCapricornio = new javax.swing.JLabel();
        corCapricornio = new javax.swing.JLabel();
        numeroCapricornio = new javax.swing.JLabel();
        tfPeriodoCapricornio = new javax.swing.JTextField();
        tfElementosCapricornio = new javax.swing.JTextField();
        tfPlanetaCapricornio = new javax.swing.JTextField();
        tfCorCapricornio = new javax.swing.JTextField();
        tfNumeroCapricornio = new javax.swing.JTextField();
        areaCaracteristicas9 = new javax.swing.JPanel();
        tituloCaracterísticas9 = new javax.swing.JLabel();
        pfortesCapricornio = new javax.swing.JLabel();
        pMelhoriasCapricornio = new javax.swing.JLabel();
        jScrollPane20 = new javax.swing.JScrollPane();
        txFortesCapricornio = new javax.swing.JTextArea();
        jScrollPane21 = new javax.swing.JScrollPane();
        txMelhorarCapricornio = new javax.swing.JTextArea();
        areaEnergia9 = new javax.swing.JPanel();
        tituloEnergiaCapricornio = new javax.swing.JLabel();
        amorCapricornio = new javax.swing.JLabel();
        tfAmorCapricornio = new javax.swing.JTextField();
        trabalhoCapricornio = new javax.swing.JLabel();
        tfTrabalhoCapricornio = new javax.swing.JTextField();
        saudeCapricornio = new javax.swing.JLabel();
        tfSaudeCapricornio = new javax.swing.JTextField();
        sorteCapricornio = new javax.swing.JLabel();
        tfSorteCapricornio = new javax.swing.JTextField();
        areaMensagem9 = new javax.swing.JPanel();
        tituloMensagemCapricornio = new javax.swing.JLabel();
        txMensagemCapricornio = new javax.swing.JScrollPane();
        btnCopiarMsgCapricornio = new javax.swing.JButton();
        fundocapricornio = new javax.swing.JLabel();
        fundoAquario = new javax.swing.JPanel();
        areaPrevisoes10 = new javax.swing.JPanel();
        areaPrevisao10 = new javax.swing.JLabel();
        btnAtualizarPrevisaoAquario = new javax.swing.JButton();
        txPrevisaoAquario = new javax.swing.JScrollPane();
        areaInformacoes10 = new javax.swing.JPanel();
        imgSignoAquario = new javax.swing.JLabel();
        tituloAquario = new javax.swing.JLabel();
        periodoAquario = new javax.swing.JLabel();
        elementoAquario = new javax.swing.JLabel();
        planetaAquario = new javax.swing.JLabel();
        corAquario = new javax.swing.JLabel();
        numeroAquario = new javax.swing.JLabel();
        tfPeriodoAquario = new javax.swing.JTextField();
        tfElementosAquario = new javax.swing.JTextField();
        tfPlanetaAquario = new javax.swing.JTextField();
        tfCorAquario = new javax.swing.JTextField();
        tfNumeroAquario = new javax.swing.JTextField();
        areaCaracteristicas10 = new javax.swing.JPanel();
        tituloCaracterísticas10 = new javax.swing.JLabel();
        pfortesAquario = new javax.swing.JLabel();
        pMelhoriasAquario = new javax.swing.JLabel();
        jScrollPane22 = new javax.swing.JScrollPane();
        txFortesAquario = new javax.swing.JTextArea();
        jScrollPane23 = new javax.swing.JScrollPane();
        txMelhorarAquario = new javax.swing.JTextArea();
        areaEnergia10 = new javax.swing.JPanel();
        tituloEnergiaAquario = new javax.swing.JLabel();
        amorAquario = new javax.swing.JLabel();
        tfAmorAquario = new javax.swing.JTextField();
        trabalhoAquario = new javax.swing.JLabel();
        tfTrabalhoAquario = new javax.swing.JTextField();
        saudeAquario = new javax.swing.JLabel();
        tfSaudeAquario = new javax.swing.JTextField();
        sorteAquario = new javax.swing.JLabel();
        tfSorteAquario = new javax.swing.JTextField();
        areaMensagem10 = new javax.swing.JPanel();
        tituloMensagemAquario = new javax.swing.JLabel();
        txMensagemAquario = new javax.swing.JScrollPane();
        btnCopiarMsgAquario = new javax.swing.JButton();
        fundoaquario = new javax.swing.JLabel();
        fundoPeixes = new javax.swing.JPanel();
        areaPrevisoes11 = new javax.swing.JPanel();
        areaPrevisao11 = new javax.swing.JLabel();
        btnAtualizarPrevisaoPeixes = new javax.swing.JButton();
        txPrevisaoPeixes = new javax.swing.JScrollPane();
        areaInformacoes11 = new javax.swing.JPanel();
        imgSignoPeixes = new javax.swing.JLabel();
        tituloPeixes = new javax.swing.JLabel();
        periodoPeixes = new javax.swing.JLabel();
        elementoPeixes = new javax.swing.JLabel();
        planetaPeixes = new javax.swing.JLabel();
        corPeixes = new javax.swing.JLabel();
        numeroPeixes = new javax.swing.JLabel();
        tfPeriodoPeixes = new javax.swing.JTextField();
        tfElementosPeixes = new javax.swing.JTextField();
        tfPlanetaPeixes = new javax.swing.JTextField();
        tfCorPeixes = new javax.swing.JTextField();
        tfNumeroPeixes = new javax.swing.JTextField();
        areaCaracteristicas11 = new javax.swing.JPanel();
        tituloCaracterísticas11 = new javax.swing.JLabel();
        pfortesPeixes = new javax.swing.JLabel();
        pMelhoriasPeixes = new javax.swing.JLabel();
        jScrollPane24 = new javax.swing.JScrollPane();
        txFortesPeixes = new javax.swing.JTextArea();
        jScrollPane25 = new javax.swing.JScrollPane();
        txMelhorarPeixes = new javax.swing.JTextArea();
        areaEnergia11 = new javax.swing.JPanel();
        tituloEnergiaPeixes = new javax.swing.JLabel();
        amorPeixes = new javax.swing.JLabel();
        tfAmorPeixes = new javax.swing.JTextField();
        trabalhoPeixes = new javax.swing.JLabel();
        tfTrabalhoPeixes = new javax.swing.JTextField();
        saudePeixes = new javax.swing.JLabel();
        tfSaudePeixes = new javax.swing.JTextField();
        sortePeixes = new javax.swing.JLabel();
        tfSortePeixes = new javax.swing.JTextField();
        areaMensagem11 = new javax.swing.JPanel();
        tituloMensagemPeixes = new javax.swing.JLabel();
        txMensagemPeixes = new javax.swing.JScrollPane();
        btnCopiarMsgPeixes = new javax.swing.JButton();
        fundopeixes = new javax.swing.JLabel();
        fundovirgem = new javax.swing.JPanel();
        areaInformacoes12 = new javax.swing.JPanel();
        imgSignoVirgem = new javax.swing.JLabel();
        tituloVirgem = new javax.swing.JLabel();
        periodoVirgem = new javax.swing.JLabel();
        elementovirgem = new javax.swing.JLabel();
        planetaVirgem = new javax.swing.JLabel();
        corVirgem = new javax.swing.JLabel();
        numeroVirgem = new javax.swing.JLabel();
        tfPeriodoVirgem = new javax.swing.JTextField();
        tfElementosVirgem = new javax.swing.JTextField();
        tfPlanetaVirgem = new javax.swing.JTextField();
        tfCorVirgem = new javax.swing.JTextField();
        tfNumeroVirgem = new javax.swing.JTextField();
        areaCaracteristicas12 = new javax.swing.JPanel();
        tituloCaracterísticas12 = new javax.swing.JLabel();
        pfortesVirgem = new javax.swing.JLabel();
        pMelhoriasVirgem = new javax.swing.JLabel();
        jScrollPane26 = new javax.swing.JScrollPane();
        txFortesVirgem = new javax.swing.JTextArea();
        jScrollPane27 = new javax.swing.JScrollPane();
        txMelhorarVirgem = new javax.swing.JTextArea();
        areaPrevisoes12 = new javax.swing.JPanel();
        areaPrevisao12 = new javax.swing.JLabel();
        btnAtualizarPrevisaoVirgem = new javax.swing.JButton();
        txPrevisaoVirgem = new javax.swing.JScrollPane();
        areaEnergia12 = new javax.swing.JPanel();
        tituloEnergiaVirgem = new javax.swing.JLabel();
        amorVirgem = new javax.swing.JLabel();
        tfAmorVirgem = new javax.swing.JTextField();
        trabalhoVirgem = new javax.swing.JLabel();
        tfTrabalhoVirgem = new javax.swing.JTextField();
        saudeVirgem = new javax.swing.JLabel();
        tfSaudeVirgem = new javax.swing.JTextField();
        sorteVirgem = new javax.swing.JLabel();
        tfSorteVirgem = new javax.swing.JTextField();
        areaMensagem12 = new javax.swing.JPanel();
        tituloMensagemVirgem = new javax.swing.JLabel();
        txMensagemVirgem = new javax.swing.JScrollPane();
        btnCopiarMsgVirgem = new javax.swing.JButton();
        fundoVirgem = new javax.swing.JLabel();
        fundoleao = new javax.swing.JPanel();
        areaInformacoes13 = new javax.swing.JPanel();
        imgSignoLeao = new javax.swing.JLabel();
        tituloLeao = new javax.swing.JLabel();
        periodoLeao = new javax.swing.JLabel();
        elementoLeao = new javax.swing.JLabel();
        planetaLeao = new javax.swing.JLabel();
        corLeao = new javax.swing.JLabel();
        numeroLeao = new javax.swing.JLabel();
        tfPeriodoLeao = new javax.swing.JTextField();
        tfElementosLeao = new javax.swing.JTextField();
        tfPlanetaLeao = new javax.swing.JTextField();
        tfCorLeao = new javax.swing.JTextField();
        tfNumeroLeao = new javax.swing.JTextField();
        areaCaracteristicas13 = new javax.swing.JPanel();
        tituloCaracterísticas13 = new javax.swing.JLabel();
        pfortesLeao = new javax.swing.JLabel();
        pMelhoriasLeao = new javax.swing.JLabel();
        jScrollPane28 = new javax.swing.JScrollPane();
        txFortesLeao = new javax.swing.JTextArea();
        jScrollPane29 = new javax.swing.JScrollPane();
        txMelhorarLeao = new javax.swing.JTextArea();
        areaPrevisoes13 = new javax.swing.JPanel();
        areaPrevisao13 = new javax.swing.JLabel();
        btnAtualizarPrevisaoLeao = new javax.swing.JButton();
        txPrevisaoLeao = new javax.swing.JScrollPane();
        areaEnergia13 = new javax.swing.JPanel();
        tituloEnergiaLeao = new javax.swing.JLabel();
        amorLeao = new javax.swing.JLabel();
        tfAmorLeao = new javax.swing.JTextField();
        trabalhoLeao = new javax.swing.JLabel();
        tfTrabalhoLeao = new javax.swing.JTextField();
        saudeLeao = new javax.swing.JLabel();
        tfSaudeLeao = new javax.swing.JTextField();
        sorteLeao = new javax.swing.JLabel();
        tfSorteLeao = new javax.swing.JTextField();
        areaMensagem13 = new javax.swing.JPanel();
        tituloMensagemLeao = new javax.swing.JLabel();
        txMensagemLeao = new javax.swing.JScrollPane();
        btnCopiarMsgLeao = new javax.swing.JButton();
        fundoLeao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        areasAbas.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N

        inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCompatibilidade.setFont(new java.awt.Font("Perpetua Titling MT", 3, 18)); // NOI18N
        tituloCompatibilidade.setText("Compatibilidade");

        Signo1.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        Signo1.setText("PrimeiroSigno:");

        Signo2.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        Signo2.setText("SegundoSigno:");

        jComboBox1.setFont(new java.awt.Font("Segoe UI Historic", 3, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Áries ", "Touro ", "Gêmeos ", "Câncer ", "Leão ", "Virgem ", "Libra ", "Escorpião ", "Sagitário ", "Capricórnio ", "Aquário ", "Peixes " }));

        jComboBox2.setFont(new java.awt.Font("Segoe UI Historic", 3, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Áries ", "Touro ", "Gêmeos ", "Câncer ", "Leão ", "Virgem ", "Libra ", "Escorpião ", "Sagitário ", "Capricórnio ", "Aquário ", "Peixes ", " " }));

        btnCalcular.setBackground(new java.awt.Color(153, 153, 255));
        btnCalcular.setFont(new java.awt.Font("Perpetua Titling MT", 3, 12)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("Calcular");

        javax.swing.GroupLayout areaCompatibilidadeLayout = new javax.swing.GroupLayout(areaCompatibilidade);
        areaCompatibilidade.setLayout(areaCompatibilidadeLayout);
        areaCompatibilidadeLayout.setHorizontalGroup(
            areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCompatibilidadeLayout.createSequentialGroup()
                .addGroup(areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCompatibilidadeLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Signo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Signo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox2, 0, 164, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(areaCompatibilidadeLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(tituloCompatibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaCompatibilidadeLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btnCalcular)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        areaCompatibilidadeLayout.setVerticalGroup(
            areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCompatibilidadeLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(tituloCompatibilidade)
                .addGap(30, 30, 30)
                .addGroup(areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Signo1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Signo2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnCalcular)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        inicio.add(areaCompatibilidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 300, 350));

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 3, 18)); // NOI18N
        jLabel1.setText("Descubra Seu Signo");

        jLabel2.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        jLabel3.setText("Dia de Nascimento:");

        jLabel4.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        jLabel4.setText("Mês de Nascimento:");

        tfNome.setText("digite seu nome");

        cbDia.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        cbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cbMes.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JANEIRO", "FEVEREIRO", "MARÇO", "ABRIL", "MAIO", "JUNHO", "JULHO", "AGOSTO", "SETEMBRO", "OUTUBRO", "NOVEMBRO", "DEZEMBRO" }));

        btnDescobrirSigno.setBackground(new java.awt.Color(153, 153, 255));
        btnDescobrirSigno.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        btnDescobrirSigno.setForeground(new java.awt.Color(255, 255, 255));
        btnDescobrirSigno.setText("Descobrir Signo");

        javax.swing.GroupLayout areaDescobrirSignoLayout = new javax.swing.GroupLayout(areaDescobrirSigno);
        areaDescobrirSigno.setLayout(areaDescobrirSignoLayout);
        areaDescobrirSignoLayout.setHorizontalGroup(
            areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(btnDescobrirSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        areaDescobrirSignoLayout.setVerticalGroup(
            areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnDescobrirSigno)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        inicio.add(areaDescobrirSigno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 310, 290));

        jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 3, 18)); // NOI18N
        jLabel5.setText("Signo");

        jLabel6.setFont(new java.awt.Font("Perpetua Titling MT", 3, 18)); // NOI18N
        jLabel6.setText("compatibilidade");

        javax.swing.GroupLayout tfCompatibilidadeLayout = new javax.swing.GroupLayout(tfCompatibilidade);
        tfCompatibilidade.setLayout(tfCompatibilidadeLayout);
        tfCompatibilidadeLayout.setHorizontalGroup(
            tfCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        tfCompatibilidadeLayout.setVerticalGroup(
            tfCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 146, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout areaRsultadoLayout = new javax.swing.GroupLayout(areaRsultado);
        areaRsultado.setLayout(areaRsultadoLayout);
        areaRsultadoLayout.setHorizontalGroup(
            areaRsultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaRsultadoLayout.createSequentialGroup()
                .addGroup(areaRsultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaRsultadoLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel5))
                    .addGroup(areaRsultadoLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaRsultadoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(areaRsultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(areaRsultadoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tfCompatibilidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        areaRsultadoLayout.setVerticalGroup(
            areaRsultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaRsultadoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addComponent(jLabel6)
                .addContainerGap(231, Short.MAX_VALUE))
            .addGroup(areaRsultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(areaRsultadoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tfCompatibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        inicio.add(areaRsultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 20, 310, 600));

        fundoinicio.setIcon(new javax.swing.ImageIcon("C:\\Users\\KawanDantas\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Inicio.jpg")); // NOI18N
        inicio.add(fundoinicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 960));

        areasAbas.addTab("Inicio", inicio);

        fundoaries.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgSignoAries.setIcon(new javax.swing.ImageIcon("C:\\Users\\KawanDantas\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Aries.jpg")); // NOI18N

        tituloAries.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        tituloAries.setText("ÁRIES");

        periodoAries.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        periodoAries.setText("PERIODO:");

        elementoAries.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        elementoAries.setText("ELEMENTO:");

        planetaAries.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        planetaAries.setText("PLANETA REGENTE:");

        corAries.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        corAries.setText("COR:");

        numeroAries.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        numeroAries.setText("NÚMERO DA SORTE:");

        tfPeriodoAries.setBackground(new java.awt.Color(0, 0, 0));
        tfPeriodoAries.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfPeriodoAries.setForeground(new java.awt.Color(255, 0, 51));
        tfPeriodoAries.setText("21/03 a 19/04");

        tfElementosAries.setBackground(new java.awt.Color(0, 0, 0));
        tfElementosAries.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfElementosAries.setForeground(new java.awt.Color(255, 0, 51));
        tfElementosAries.setText("Fogo");

        tfPlanetaAries.setBackground(new java.awt.Color(0, 0, 0));
        tfPlanetaAries.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfPlanetaAries.setForeground(new java.awt.Color(255, 0, 51));
        tfPlanetaAries.setText("Marte");

        tfCorAries.setBackground(new java.awt.Color(0, 0, 0));
        tfCorAries.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfCorAries.setForeground(new java.awt.Color(255, 0, 51));
        tfCorAries.setText("Vermelho");

        tfNumeroAries.setBackground(new java.awt.Color(0, 0, 0));
        tfNumeroAries.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfNumeroAries.setForeground(new java.awt.Color(255, 0, 51));
        tfNumeroAries.setText("9");

        javax.swing.GroupLayout areaInformacoesLayout = new javax.swing.GroupLayout(areaInformacoes);
        areaInformacoes.setLayout(areaInformacoesLayout);
        areaInformacoesLayout.setHorizontalGroup(
            areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesLayout.createSequentialGroup()
                .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imgSignoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(areaInformacoesLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(areaInformacoesLayout.createSequentialGroup()
                                .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(areaInformacoesLayout.createSequentialGroup()
                                        .addComponent(elementoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfElementosAries))
                                    .addGroup(areaInformacoesLayout.createSequentialGroup()
                                        .addComponent(corAries, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCorAries))
                                    .addGroup(areaInformacoesLayout.createSequentialGroup()
                                        .addComponent(planetaAries)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPlanetaAries))
                                    .addGroup(areaInformacoesLayout.createSequentialGroup()
                                        .addComponent(numeroAries, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfNumeroAries))
                                    .addGroup(areaInformacoesLayout.createSequentialGroup()
                                        .addComponent(periodoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPeriodoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 17, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        areaInformacoesLayout.setVerticalGroup(
            areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(areaInformacoesLayout.createSequentialGroup()
                        .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(areaInformacoesLayout.createSequentialGroup()
                                .addComponent(imgSignoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tituloAries, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(periodoAries))
                            .addComponent(tfPeriodoAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(elementoAries)
                            .addComponent(tfElementosAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(planetaAries))
                    .addComponent(tfPlanetaAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(corAries)
                    .addComponent(tfCorAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numeroAries, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfNumeroAries, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        fundoaries.add(areaInformacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, 690));

        tituloCaracterísticas.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        tituloCaracterísticas.setText("Características");

        pfortesAries.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        pfortesAries.setText("Pontos Fortes:");

        pMelhoriasAries.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        pMelhoriasAries.setText("Pontos a Melhorar:");

        txFortesAries.setColumns(20);
        txFortesAries.setRows(5);
        txFortesAries.setText("\nÁries costuma ser associado a pessoas de muita iniciativa, coragem e energia. É um signo que tende a gostar de tomar atitudes em vez de ficar esperando as coisas acontecerem. Pode ter facilidade para assumir a liderança, enfrentar desafios e defender aquilo em que acredita.");
        jScrollPane2.setViewportView(txFortesAries);

        txMelhorarAries.setColumns(20);
        txMelhorarAries.setRows(5);
        txMelhorarAries.setText("O principal desafio de Áries costuma estar relacionado à impulsividade. Por agir rapidamente, pode tomar decisões antes de analisar todas as consequências. A impaciência também pode aparecer quando as coisas não acontecem no ritmo esperado.\n");
        jScrollPane3.setViewportView(txMelhorarAries);

        javax.swing.GroupLayout areaCaracteristicasLayout = new javax.swing.GroupLayout(areaCaracteristicas);
        areaCaracteristicas.setLayout(areaCaracteristicasLayout);
        areaCaracteristicasLayout.setHorizontalGroup(
            areaCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(areaCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(areaCaracteristicasLayout.createSequentialGroup()
                        .addGroup(areaCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloCaracterísticas, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pfortesAries)
                            .addComponent(pMelhoriasAries))
                        .addGap(0, 59, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        areaCaracteristicasLayout.setVerticalGroup(
            areaCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tituloCaracterísticas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pfortesAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pMelhoriasAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        fundoaries.add(areaCaracteristicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 310, 300));

        areaPrevisao.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        areaPrevisao.setText("Previsão do Dia:");

        btnAtualizarPrevisaoAries.setBackground(new java.awt.Color(0, 0, 0));
        btnAtualizarPrevisaoAries.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        btnAtualizarPrevisaoAries.setForeground(new java.awt.Color(255, 0, 51));
        btnAtualizarPrevisaoAries.setText("Atualizar Previsão");

        txtPrevisaoAries.setColumns(20);
        txtPrevisaoAries.setRows(5);
        txtPrevis.setViewportView(txtPrevisaoAries);

        javax.swing.GroupLayout areaPrevisoesLayout = new javax.swing.GroupLayout(areaPrevisoes);
        areaPrevisoes.setLayout(areaPrevisoesLayout);
        areaPrevisoesLayout.setHorizontalGroup(
            areaPrevisoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesLayout.createSequentialGroup()
                .addGroup(areaPrevisoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoesLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnAtualizarPrevisaoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaPrevisoesLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(areaPrevisoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaPrevisoesLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtPrevis, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(areaPrevisao, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        areaPrevisoesLayout.setVerticalGroup(
            areaPrevisoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(areaPrevisao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrevis, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizarPrevisaoAries)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        fundoaries.add(areaPrevisoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 300, 290));

        tituloEnergiaAries.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        tituloEnergiaAries.setText("Energia do Dia:");

        amorAries.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        amorAries.setText("Amor:");

        tfAmorAries.setText("85%");

        trabalhoAries.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        trabalhoAries.setText("Trabalho:");

        tfTrabalhoAries.setText("90%");

        saudeAries.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        saudeAries.setText("Saúde:");

        tfSaudeAries.setText("75%");

        sorteAries.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        sorteAries.setText("Sorte:");

        tfSorteAries.setText("80%");

        javax.swing.GroupLayout areaEnergiaLayout = new javax.swing.GroupLayout(areaEnergia);
        areaEnergia.setLayout(areaEnergiaLayout);
        areaEnergiaLayout.setHorizontalGroup(
            areaEnergiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLayout.createSequentialGroup()
                .addGroup(areaEnergiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(tituloEnergiaAries, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaEnergiaLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(areaEnergiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfTrabalhoAries, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(trabalhoAries)
                            .addComponent(tfAmorAries)
                            .addComponent(amorAries)
                            .addComponent(saudeAries)
                            .addComponent(tfSaudeAries)
                            .addComponent(sorteAries)
                            .addComponent(tfSorteAries))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        areaEnergiaLayout.setVerticalGroup(
            areaEnergiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amorAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trabalhoAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sorteAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        fundoaries.add(areaEnergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 50, 320, 300));

        tituloMensagemAries.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        tituloMensagemAries.setText("Mensagem do dia");

        btnCopiarMsgAries.setBackground(new java.awt.Color(0, 0, 0));
        btnCopiarMsgAries.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        btnCopiarMsgAries.setForeground(new java.awt.Color(255, 0, 51));
        btnCopiarMsgAries.setText("Copiar Mensagem");

        txtMensagemAries.setColumns(20);
        txtMensagemAries.setRows(5);
        jScrollPane1.setViewportView(txtMensagemAries);

        javax.swing.GroupLayout areaMensagemLayout = new javax.swing.GroupLayout(areaMensagem);
        areaMensagem.setLayout(areaMensagemLayout);
        areaMensagemLayout.setHorizontalGroup(
            areaMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLayout.createSequentialGroup()
                .addGroup(areaMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloMensagemAries))
                    .addGroup(areaMensagemLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnCopiarMsgAries, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaMensagemLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        areaMensagemLayout.setVerticalGroup(
            areaMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCopiarMsgAries)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        fundoaries.add(areaMensagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 410, 320, 230));

        fundoAries.setIcon(new javax.swing.ImageIcon("C:\\Users\\KawanDantas\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Aries.jpg")); // NOI18N
        fundoaries.add(fundoAries, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));
        fundoaries.add(txPrevisaoAries, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 40, 272, 140));

        jTextField1.setText("jTextField1");
        fundoaries.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 80, 264, 146));

        areasAbas.addTab("Áries", fundoaries);

        fundoTouro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaPrevisao1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        areaPrevisao1.setText("Previsão do Dia:");

        btnAtualizarPrevisaoTouro.setBackground(new java.awt.Color(0, 0, 0));
        btnAtualizarPrevisaoTouro.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        btnAtualizarPrevisaoTouro.setForeground(new java.awt.Color(51, 204, 0));
        btnAtualizarPrevisaoTouro.setText("Atualizar Previsão");

        txtPrevisaoTouro.setColumns(20);
        txtPrevisaoTouro.setRows(5);
        jScrollPane10.setViewportView(txtPrevisaoTouro);

        javax.swing.GroupLayout areaPrevisoes1Layout = new javax.swing.GroupLayout(areaPrevisoes1);
        areaPrevisoes1.setLayout(areaPrevisoes1Layout);
        areaPrevisoes1Layout.setHorizontalGroup(
            areaPrevisoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoes1Layout.createSequentialGroup()
                .addGroup(areaPrevisoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoes1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnAtualizarPrevisaoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaPrevisoes1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(areaPrevisoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(areaPrevisao1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        areaPrevisoes1Layout.setVerticalGroup(
            areaPrevisoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoes1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(areaPrevisao1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizarPrevisaoTouro)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        fundoTouro.add(areaPrevisoes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 300, 250));

        imgSignoTouro.setIcon(new javax.swing.ImageIcon("C:\\Users\\KawanDantas\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Touro.jpg")); // NOI18N

        tituloTouro.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        tituloTouro.setText("TOURO");

        periodoTouro.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        periodoTouro.setText("PERIODO:");

        elementoTouro.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        elementoTouro.setText("ELEMENTO:");

        planetaTouro.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        planetaTouro.setText("PLANETA REGENTE:");

        corTouro.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        corTouro.setText("COR:");

        numeroTouro.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        numeroTouro.setText("NÚMERO DA SORTE:");

        tfPeriodoTouro.setBackground(new java.awt.Color(0, 0, 0));
        tfPeriodoTouro.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfPeriodoTouro.setForeground(new java.awt.Color(51, 204, 0));
        tfPeriodoTouro.setText("20/04 a 20/05");

        tfElementosTouro.setBackground(new java.awt.Color(0, 0, 0));
        tfElementosTouro.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfElementosTouro.setForeground(new java.awt.Color(51, 204, 0));
        tfElementosTouro.setText("Terra\n");

        tfPlanetaTouro.setBackground(new java.awt.Color(0, 0, 0));
        tfPlanetaTouro.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfPlanetaTouro.setForeground(new java.awt.Color(51, 204, 0));
        tfPlanetaTouro.setText("Vênus\n");

        tfCorTouro.setBackground(new java.awt.Color(0, 0, 0));
        tfCorTouro.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfCorTouro.setForeground(new java.awt.Color(51, 204, 0));
        tfCorTouro.setText("Verde\n");

        tfNumeroTouro.setBackground(new java.awt.Color(0, 0, 0));
        tfNumeroTouro.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfNumeroTouro.setForeground(new java.awt.Color(51, 204, 0));
        tfNumeroTouro.setText("6");

        javax.swing.GroupLayout areaInformacoes1Layout = new javax.swing.GroupLayout(areaInformacoes1);
        areaInformacoes1.setLayout(areaInformacoes1Layout);
        areaInformacoes1Layout.setHorizontalGroup(
            areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes1Layout.createSequentialGroup()
                .addGroup(areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoes1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imgSignoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(areaInformacoes1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(areaInformacoes1Layout.createSequentialGroup()
                                .addGroup(areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(areaInformacoes1Layout.createSequentialGroup()
                                        .addComponent(elementoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfElementosTouro))
                                    .addGroup(areaInformacoes1Layout.createSequentialGroup()
                                        .addComponent(corTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCorTouro))
                                    .addGroup(areaInformacoes1Layout.createSequentialGroup()
                                        .addComponent(planetaTouro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPlanetaTouro))
                                    .addGroup(areaInformacoes1Layout.createSequentialGroup()
                                        .addComponent(numeroTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfNumeroTouro))
                                    .addGroup(areaInformacoes1Layout.createSequentialGroup()
                                        .addComponent(periodoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPeriodoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 17, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        areaInformacoes1Layout.setVerticalGroup(
            areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(areaInformacoes1Layout.createSequentialGroup()
                        .addGroup(areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(areaInformacoes1Layout.createSequentialGroup()
                                .addComponent(imgSignoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tituloTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(periodoTouro))
                            .addComponent(tfPeriodoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(elementoTouro)
                            .addComponent(tfElementosTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(planetaTouro))
                    .addComponent(tfPlanetaTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(corTouro)
                    .addComponent(tfCorTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numeroTouro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfNumeroTouro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        fundoTouro.add(areaInformacoes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, 690));

        tituloCaracterísticas1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        tituloCaracterísticas1.setText("Características");

        pfortesTouro.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        pfortesTouro.setText("Pontos Fortes:");

        pMelhoriasTouro.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        pMelhoriasTouro.setText("Pontos a Melhorar:");

        txFortesTouro.setColumns(20);
        txFortesTouro.setRows(5);
        txFortesTouro.setText("Touro é frequentemente associado à estabilidade, lealdade e determinação. É um signo que costuma valorizar segurança, confiança e relações duradouras. Quando assume um compromisso, tende a levar aquilo a sério e pode ser uma pessoa muito confiável.");
        jScrollPane4.setViewportView(txFortesTouro);

        txMelhorarTouro.setColumns(20);
        txMelhorarTouro.setRows(5);
        txMelhorarTouro.setText("A teimosia é uma das características mais associadas aos desafios de Touro. Quando cria uma opinião ou se acostuma com determinada situação, pode ter dificuldade para aceitar mudanças.");
        jScrollPane5.setViewportView(txMelhorarTouro);

        javax.swing.GroupLayout areaCaracteristicas1Layout = new javax.swing.GroupLayout(areaCaracteristicas1);
        areaCaracteristicas1.setLayout(areaCaracteristicas1Layout);
        areaCaracteristicas1Layout.setHorizontalGroup(
            areaCaracteristicas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(areaCaracteristicas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tituloCaracterísticas1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pfortesTouro)
                    .addComponent(pMelhoriasTouro)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        areaCaracteristicas1Layout.setVerticalGroup(
            areaCaracteristicas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tituloCaracterísticas1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pfortesTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhoriasTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        fundoTouro.add(areaCaracteristicas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 300, 320));

        tituloEnergiaTouro.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        tituloEnergiaTouro.setText("Energia do Dia:");

        amorTouro.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        amorTouro.setText("Amor:");

        tfAmorTouro.setText("90%");

        trabalhoTouro.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        trabalhoTouro.setText("Trabalho:");

        tfTrabalhoTouro.setText("88%");

        saudeTouro.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        saudeTouro.setText("Saúde:");

        tfSaudeTouro.setText("92%");

        sorteTouro.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        sorteTouro.setText("Sorte:");

        tfSorteTouro.setText("80%");

        javax.swing.GroupLayout areaEnergia1Layout = new javax.swing.GroupLayout(areaEnergia1);
        areaEnergia1.setLayout(areaEnergia1Layout);
        areaEnergia1Layout.setHorizontalGroup(
            areaEnergia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia1Layout.createSequentialGroup()
                .addGroup(areaEnergia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergia1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(tituloEnergiaTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaEnergia1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(areaEnergia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfTrabalhoTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(trabalhoTouro)
                            .addComponent(tfAmorTouro)
                            .addComponent(amorTouro)
                            .addComponent(saudeTouro)
                            .addComponent(tfSaudeTouro)
                            .addComponent(sorteTouro)
                            .addComponent(tfSorteTouro))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        areaEnergia1Layout.setVerticalGroup(
            areaEnergia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amorTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trabalhoTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sorteTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        fundoTouro.add(areaEnergia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 50, 320, 300));

        tituloMensagemTouro.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        tituloMensagemTouro.setText("Mensagem do dia");

        btnCopiarMsgTouro.setBackground(new java.awt.Color(51, 51, 51));
        btnCopiarMsgTouro.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        btnCopiarMsgTouro.setForeground(new java.awt.Color(51, 204, 0));
        btnCopiarMsgTouro.setText("Copiar Mensagem");

        txtMensagemTouro.setColumns(20);
        txtMensagemTouro.setRows(5);
        jScrollPane11.setViewportView(txtMensagemTouro);

        javax.swing.GroupLayout areaMensagem1Layout = new javax.swing.GroupLayout(areaMensagem1);
        areaMensagem1.setLayout(areaMensagem1Layout);
        areaMensagem1Layout.setHorizontalGroup(
            areaMensagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem1Layout.createSequentialGroup()
                .addGroup(areaMensagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagem1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnCopiarMsgTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaMensagem1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaMensagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaMensagem1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tituloMensagemTouro))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        areaMensagem1Layout.setVerticalGroup(
            areaMensagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCopiarMsgTouro)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        fundoTouro.add(areaMensagem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 410, 320, 230));

        fundotouro.setIcon(new javax.swing.ImageIcon("C:\\Users\\KawanDantas\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Touro.jpg")); // NOI18N
        fundoTouro.add(fundotouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        areasAbas.addTab("Touro", fundoTouro);

        fundoGemeos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaPrevisao2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        areaPrevisao2.setText("Previsão do Dia:");

        btnAtualizarPrevisaoGemeos.setBackground(new java.awt.Color(51, 51, 51));
        btnAtualizarPrevisaoGemeos.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        btnAtualizarPrevisaoGemeos.setForeground(new java.awt.Color(255, 255, 0));
        btnAtualizarPrevisaoGemeos.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisoes2Layout = new javax.swing.GroupLayout(areaPrevisoes2);
        areaPrevisoes2.setLayout(areaPrevisoes2Layout);
        areaPrevisoes2Layout.setHorizontalGroup(
            areaPrevisoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoes2Layout.createSequentialGroup()
                .addGroup(areaPrevisoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoes2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(areaPrevisoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(areaPrevisao2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txPrevisaoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaPrevisoes2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnAtualizarPrevisaoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        areaPrevisoes2Layout.setVerticalGroup(
            areaPrevisoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoes2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(areaPrevisao2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtualizarPrevisaoGemeos)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        fundoGemeos.add(areaPrevisoes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 300, 250));

        imgSignoGemeos.setIcon(new javax.swing.ImageIcon("C:\\Users\\KawanDantas\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Gemeos.jpg")); // NOI18N

        tituloGemeos.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        tituloGemeos.setText("GÊMEOS");

        periodoGemeos.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        periodoGemeos.setText("PERIODO:");

        elementoGemeos.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        elementoGemeos.setText("ELEMENTO:");

        planetaGemeos.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        planetaGemeos.setText("PLANETA REGENTE:");

        corGemeos.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        corGemeos.setText("COR:");

        numeroGemeos.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        numeroGemeos.setText("NÚMERO DA SORTE:");

        tfPeriodoGemeos.setBackground(new java.awt.Color(0, 0, 0));
        tfPeriodoGemeos.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfPeriodoGemeos.setForeground(new java.awt.Color(255, 255, 0));
        tfPeriodoGemeos.setText("21/05 a 20/06");

        tfElementosGemeos.setBackground(new java.awt.Color(0, 0, 0));
        tfElementosGemeos.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfElementosGemeos.setForeground(new java.awt.Color(255, 255, 0));
        tfElementosGemeos.setText("Ar\n");

        tfPlanetaGemeos.setBackground(new java.awt.Color(0, 0, 0));
        tfPlanetaGemeos.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfPlanetaGemeos.setForeground(new java.awt.Color(255, 255, 0));
        tfPlanetaGemeos.setText("Mercúrio\n");

        tfCorGemeos.setBackground(new java.awt.Color(0, 0, 0));
        tfCorGemeos.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfCorGemeos.setForeground(new java.awt.Color(255, 255, 0));
        tfCorGemeos.setText("Amarelo");

        tfNumeroGemeos.setBackground(new java.awt.Color(0, 0, 0));
        tfNumeroGemeos.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfNumeroGemeos.setForeground(new java.awt.Color(255, 255, 0));
        tfNumeroGemeos.setText("5");

        javax.swing.GroupLayout areaInformacoes2Layout = new javax.swing.GroupLayout(areaInformacoes2);
        areaInformacoes2.setLayout(areaInformacoes2Layout);
        areaInformacoes2Layout.setHorizontalGroup(
            areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes2Layout.createSequentialGroup()
                .addGroup(areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoes2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imgSignoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(areaInformacoes2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(areaInformacoes2Layout.createSequentialGroup()
                                .addGroup(areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(areaInformacoes2Layout.createSequentialGroup()
                                        .addComponent(elementoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfElementosGemeos))
                                    .addGroup(areaInformacoes2Layout.createSequentialGroup()
                                        .addComponent(corGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCorGemeos))
                                    .addGroup(areaInformacoes2Layout.createSequentialGroup()
                                        .addComponent(planetaGemeos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPlanetaGemeos))
                                    .addGroup(areaInformacoes2Layout.createSequentialGroup()
                                        .addComponent(numeroGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfNumeroGemeos))
                                    .addGroup(areaInformacoes2Layout.createSequentialGroup()
                                        .addComponent(periodoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPeriodoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 17, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        areaInformacoes2Layout.setVerticalGroup(
            areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(areaInformacoes2Layout.createSequentialGroup()
                        .addGroup(areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(areaInformacoes2Layout.createSequentialGroup()
                                .addComponent(imgSignoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tituloGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(periodoGemeos))
                            .addComponent(tfPeriodoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(elementoGemeos)
                            .addComponent(tfElementosGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(planetaGemeos))
                    .addComponent(tfPlanetaGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(corGemeos)
                    .addComponent(tfCorGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numeroGemeos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfNumeroGemeos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        fundoGemeos.add(areaInformacoes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, 690));

        tituloCaracterísticas2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        tituloCaracterísticas2.setText("Características");

        pfortesGemeos.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        pfortesGemeos.setText("Pontos Fortes:");

        pMelhoriasGemeos.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        pMelhoriasGemeos.setText("Pontos a Melhorar:");

        txFortesGemeos.setColumns(20);
        txFortesGemeos.setRows(5);
        txFortesGemeos.setText("Gêmeos é conhecido pela comunicação, curiosidade e facilidade para aprender coisas diferentes. É um signo que geralmente gosta de conversar, trocar ideias e conhecer assuntos novos.");
        jScrollPane6.setViewportView(txFortesGemeos);

        txMelhorarGemeos.setColumns(20);
        txMelhorarGemeos.setRows(5);
        txMelhorarGemeos.setText("A dificuldade de manter o foco pode ser um dos principais desafios. Como existe muita curiosidade por diferentes assuntos, Gêmeos pode começar várias coisas e perder o interesse antes de terminá-las.");
        jScrollPane7.setViewportView(txMelhorarGemeos);

        javax.swing.GroupLayout areaCaracteristicas2Layout = new javax.swing.GroupLayout(areaCaracteristicas2);
        areaCaracteristicas2.setLayout(areaCaracteristicas2Layout);
        areaCaracteristicas2Layout.setHorizontalGroup(
            areaCaracteristicas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(areaCaracteristicas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tituloCaracterísticas2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pfortesGemeos)
                    .addComponent(pMelhoriasGemeos)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        areaCaracteristicas2Layout.setVerticalGroup(
            areaCaracteristicas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tituloCaracterísticas2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pfortesGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhoriasGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        fundoGemeos.add(areaCaracteristicas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 300, 320));

        tituloEnergiaGemeos.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        tituloEnergiaGemeos.setText("Energia do Dia:");

        amorGemeos.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        amorGemeos.setText("Amor:");

        tfAmorGemeos.setText("78%");

        trabalhoGemeos.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        trabalhoGemeos.setText("Trabalho:");

        tfTrabalhoGemeos.setText("85%");

        saudeGemeos.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        saudeGemeos.setText("Saúde:");

        tfSaudeGemeos.setText("75%");

        sorteGemeos.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        sorteGemeos.setText("Sorte:");

        tfSorteGemeos.setText("90%");

        javax.swing.GroupLayout areaEnergia2Layout = new javax.swing.GroupLayout(areaEnergia2);
        areaEnergia2.setLayout(areaEnergia2Layout);
        areaEnergia2Layout.setHorizontalGroup(
            areaEnergia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia2Layout.createSequentialGroup()
                .addGroup(areaEnergia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergia2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(tituloEnergiaGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaEnergia2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(areaEnergia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfTrabalhoGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(trabalhoGemeos)
                            .addComponent(tfAmorGemeos)
                            .addComponent(amorGemeos)
                            .addComponent(saudeGemeos)
                            .addComponent(tfSaudeGemeos)
                            .addComponent(sorteGemeos)
                            .addComponent(tfSorteGemeos))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        areaEnergia2Layout.setVerticalGroup(
            areaEnergia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amorGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trabalhoGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sorteGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        fundoGemeos.add(areaEnergia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 50, 320, 300));

        tituloMensagemGemeos.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        tituloMensagemGemeos.setText("Mensagem do dia");

        btnCopiarMsgGemeos.setBackground(new java.awt.Color(51, 51, 51));
        btnCopiarMsgGemeos.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        btnCopiarMsgGemeos.setForeground(new java.awt.Color(255, 255, 0));
        btnCopiarMsgGemeos.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagem2Layout = new javax.swing.GroupLayout(areaMensagem2);
        areaMensagem2.setLayout(areaMensagem2Layout);
        areaMensagem2Layout.setHorizontalGroup(
            areaMensagem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaMensagem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagem2Layout.createSequentialGroup()
                        .addComponent(tituloMensagemGemeos)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txMensagemGemeos))
                .addContainerGap())
            .addGroup(areaMensagem2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnCopiarMsgGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        areaMensagem2Layout.setVerticalGroup(
            areaMensagem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txMensagemGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCopiarMsgGemeos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fundoGemeos.add(areaMensagem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 410, 320, 230));

        fundogemeos.setIcon(new javax.swing.ImageIcon("C:\\Users\\KawanDantas\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Gemeos.jpg")); // NOI18N
        fundoGemeos.add(fundogemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        areasAbas.addTab("Gêmeos", fundoGemeos);

        fundoCancer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaPrevisao3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        areaPrevisao3.setText("Previsão do Dia:");

        btnAtualizarPrevisaoCancer.setBackground(new java.awt.Color(51, 51, 51));
        btnAtualizarPrevisaoCancer.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        btnAtualizarPrevisaoCancer.setForeground(new java.awt.Color(153, 153, 255));
        btnAtualizarPrevisaoCancer.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisoes3Layout = new javax.swing.GroupLayout(areaPrevisoes3);
        areaPrevisoes3.setLayout(areaPrevisoes3Layout);
        areaPrevisoes3Layout.setHorizontalGroup(
            areaPrevisoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoes3Layout.createSequentialGroup()
                .addGroup(areaPrevisoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoes3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(areaPrevisoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(areaPrevisao3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txPrevisaoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaPrevisoes3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnAtualizarPrevisaoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        areaPrevisoes3Layout.setVerticalGroup(
            areaPrevisoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoes3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(areaPrevisao3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtualizarPrevisaoCancer)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        fundoCancer.add(areaPrevisoes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 300, 250));

        imgSignoCancer.setIcon(new javax.swing.ImageIcon("C:\\Users\\KawanDantas\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Cancer.jpg")); // NOI18N

        tituloCancer.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        tituloCancer.setText("CÂNCER");

        periodoCancer.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        periodoCancer.setText("PERIODO:");

        elementoCancer.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        elementoCancer.setText("ELEMENTO:");

        planetaCancer.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        planetaCancer.setText("PLANETA REGENTE:");

        corCancer.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        corCancer.setText("COR:");

        numeroCancer.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        numeroCancer.setText("NÚMERO DA SORTE:");

        tfPeriodoCancer.setBackground(new java.awt.Color(0, 0, 0));
        tfPeriodoCancer.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfPeriodoCancer.setForeground(new java.awt.Color(153, 153, 255));
        tfPeriodoCancer.setText("21/06 a 22/07");

        tfElementosCancer.setBackground(new java.awt.Color(0, 0, 0));
        tfElementosCancer.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfElementosCancer.setForeground(new java.awt.Color(153, 153, 255));
        tfElementosCancer.setText("Água");

        tfPlanetaCancer.setBackground(new java.awt.Color(0, 0, 0));
        tfPlanetaCancer.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfPlanetaCancer.setForeground(new java.awt.Color(153, 153, 255));
        tfPlanetaCancer.setText("Lua\n");

        tfCorCancer.setBackground(new java.awt.Color(0, 0, 0));
        tfCorCancer.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfCorCancer.setForeground(new java.awt.Color(153, 153, 255));
        tfCorCancer.setText("Branco/Prata");

        tfNumeroCancer.setBackground(new java.awt.Color(0, 0, 0));
        tfNumeroCancer.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfNumeroCancer.setForeground(new java.awt.Color(153, 153, 255));
        tfNumeroCancer.setText("2");

        javax.swing.GroupLayout areaInformacoes3Layout = new javax.swing.GroupLayout(areaInformacoes3);
        areaInformacoes3.setLayout(areaInformacoes3Layout);
        areaInformacoes3Layout.setHorizontalGroup(
            areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes3Layout.createSequentialGroup()
                .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoes3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imgSignoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(areaInformacoes3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(areaInformacoes3Layout.createSequentialGroup()
                                .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(areaInformacoes3Layout.createSequentialGroup()
                                        .addComponent(elementoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfElementosCancer))
                                    .addGroup(areaInformacoes3Layout.createSequentialGroup()
                                        .addComponent(corCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCorCancer))
                                    .addGroup(areaInformacoes3Layout.createSequentialGroup()
                                        .addComponent(planetaCancer)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPlanetaCancer))
                                    .addGroup(areaInformacoes3Layout.createSequentialGroup()
                                        .addComponent(numeroCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfNumeroCancer))
                                    .addGroup(areaInformacoes3Layout.createSequentialGroup()
                                        .addComponent(periodoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPeriodoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 17, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        areaInformacoes3Layout.setVerticalGroup(
            areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(areaInformacoes3Layout.createSequentialGroup()
                        .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(areaInformacoes3Layout.createSequentialGroup()
                                .addComponent(imgSignoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tituloCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(periodoCancer))
                            .addComponent(tfPeriodoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(elementoCancer)
                            .addComponent(tfElementosCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(planetaCancer))
                    .addComponent(tfPlanetaCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(corCancer)
                    .addComponent(tfCorCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numeroCancer, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfNumeroCancer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        fundoCancer.add(areaInformacoes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, 690));

        tituloCaracterísticas3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        tituloCaracterísticas3.setText("Características");

        pfortesCancer.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        pfortesCancer.setText("Pontos Fortes:");

        pMelhoriasCancer.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        pMelhoriasCancer.setText("Pontos a Melhorar:");

        txFortesCancer.setColumns(20);
        txFortesCancer.setRows(5);
        txFortesCancer.setText("Câncer costuma ser associado à sensibilidade, carinho e proteção. É um signo que geralmente valoriza muito a família, os amigos e as pessoas com quem possui vínculos emocionais. Pode ser bastante atencioso e perceber mudanças no comportamento das pessoas ao seu redor.");
        jScrollPane8.setViewportView(txFortesCancer);

        txMelhorarCancer.setColumns(20);
        txMelhorarCancer.setRows(5);
        txMelhorarCancer.setText("Por ser muito sensível, Câncer pode acabar levando determinadas situações para o lado pessoal. Comentários que outras pessoas considerariam pequenos podem permanecer na memória por bastante tempo. O apego ao passado também pode dificultar a superação de algumas situações.");
        jScrollPane9.setViewportView(txMelhorarCancer);

        javax.swing.GroupLayout areaCaracteristicas3Layout = new javax.swing.GroupLayout(areaCaracteristicas3);
        areaCaracteristicas3.setLayout(areaCaracteristicas3Layout);
        areaCaracteristicas3Layout.setHorizontalGroup(
            areaCaracteristicas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(areaCaracteristicas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane8)
                    .addComponent(tituloCaracterísticas3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pfortesCancer)
                    .addComponent(pMelhoriasCancer)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        areaCaracteristicas3Layout.setVerticalGroup(
            areaCaracteristicas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tituloCaracterísticas3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pfortesCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pMelhoriasCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        fundoCancer.add(areaCaracteristicas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 300, 320));

        tituloEnergiaCancer.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        tituloEnergiaCancer.setText("Energia do Dia:");

        amorCancer.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        amorCancer.setText("Amor:");

        tfAmorCancer.setText("95%");

        trabalhoCancer.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        trabalhoCancer.setText("Trabalho:");

        tfTrabalhoCancer.setText("78%");

        saudeCancer.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        saudeCancer.setText("Saúde:");

        tfSaudeCancer.setText("82%");

        sorteCancer.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        sorteCancer.setText("Sorte:");

        tfSorteCancer.setText("84%");

        javax.swing.GroupLayout areaEnergia3Layout = new javax.swing.GroupLayout(areaEnergia3);
        areaEnergia3.setLayout(areaEnergia3Layout);
        areaEnergia3Layout.setHorizontalGroup(
            areaEnergia3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia3Layout.createSequentialGroup()
                .addGroup(areaEnergia3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergia3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(tituloEnergiaCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaEnergia3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(areaEnergia3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfTrabalhoCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(trabalhoCancer)
                            .addComponent(tfAmorCancer)
                            .addComponent(amorCancer)
                            .addComponent(saudeCancer)
                            .addComponent(tfSaudeCancer)
                            .addComponent(sorteCancer)
                            .addComponent(tfSorteCancer))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        areaEnergia3Layout.setVerticalGroup(
            areaEnergia3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amorCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trabalhoCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sorteCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        fundoCancer.add(areaEnergia3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 50, 320, 300));

        tituloMensagemCancer.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        tituloMensagemCancer.setText("Mensagem do dia");

        btnCopiarMsgCancer.setBackground(new java.awt.Color(51, 51, 51));
        btnCopiarMsgCancer.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        btnCopiarMsgCancer.setForeground(new java.awt.Color(153, 153, 255));
        btnCopiarMsgCancer.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagem3Layout = new javax.swing.GroupLayout(areaMensagem3);
        areaMensagem3.setLayout(areaMensagem3Layout);
        areaMensagem3Layout.setHorizontalGroup(
            areaMensagem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaMensagem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagem3Layout.createSequentialGroup()
                        .addComponent(tituloMensagemCancer)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txMensagemCancer))
                .addContainerGap())
            .addGroup(areaMensagem3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnCopiarMsgCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        areaMensagem3Layout.setVerticalGroup(
            areaMensagem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txMensagemCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCopiarMsgCancer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fundoCancer.add(areaMensagem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 410, 320, 230));

        fundocancer.setIcon(new javax.swing.ImageIcon("C:\\Users\\KawanDantas\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Cancer.jpg")); // NOI18N
        fundoCancer.add(fundocancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        areasAbas.addTab("Câncer", fundoCancer);

        fundoLibra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaPrevisao6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        areaPrevisao6.setText("Previsão do Dia:");

        btnAtualizarPrevisaoLibra.setBackground(new java.awt.Color(51, 51, 51));
        btnAtualizarPrevisaoLibra.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        btnAtualizarPrevisaoLibra.setForeground(new java.awt.Color(255, 102, 255));
        btnAtualizarPrevisaoLibra.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisoes6Layout = new javax.swing.GroupLayout(areaPrevisoes6);
        areaPrevisoes6.setLayout(areaPrevisoes6Layout);
        areaPrevisoes6Layout.setHorizontalGroup(
            areaPrevisoes6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoes6Layout.createSequentialGroup()
                .addGroup(areaPrevisoes6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoes6Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(areaPrevisoes6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(areaPrevisao6, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txPrevisaoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaPrevisoes6Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnAtualizarPrevisaoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        areaPrevisoes6Layout.setVerticalGroup(
            areaPrevisoes6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoes6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(areaPrevisao6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtualizarPrevisaoLibra)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        fundoLibra.add(areaPrevisoes6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 300, 250));

        imgSignoLibra.setIcon(new javax.swing.ImageIcon("C:\\Users\\KawanDantas\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Libra.jpg")); // NOI18N

        tituloLibra.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        tituloLibra.setText("LIBRA");

        periodoLibra.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        periodoLibra.setText("PERIODO:");

        elementoLibra.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        elementoLibra.setText("ELEMENTO:");

        planetaLibra.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        planetaLibra.setText("PLANETA REGENTE:");

        corLibra.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        corLibra.setText("COR:");

        numeroLibra.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        numeroLibra.setText("NÚMERO DA SORTE:");

        tfPeriodoLibra.setBackground(new java.awt.Color(0, 0, 0));
        tfPeriodoLibra.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfPeriodoLibra.setForeground(new java.awt.Color(255, 102, 255));
        tfPeriodoLibra.setText("23/09 a 22/10");

        tfElementosLibra.setBackground(new java.awt.Color(0, 0, 0));
        tfElementosLibra.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfElementosLibra.setForeground(new java.awt.Color(255, 102, 255));
        tfElementosLibra.setText("Ar");

        tfPlanetaLibra.setBackground(new java.awt.Color(0, 0, 0));
        tfPlanetaLibra.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfPlanetaLibra.setForeground(new java.awt.Color(255, 102, 255));
        tfPlanetaLibra.setText("Vênus");

        tfCorLibra.setBackground(new java.awt.Color(0, 0, 0));
        tfCorLibra.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfCorLibra.setForeground(new java.awt.Color(255, 102, 255));
        tfCorLibra.setText("Rosa/Azul-claro");

        tfNumeroLibra.setBackground(new java.awt.Color(0, 0, 0));
        tfNumeroLibra.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfNumeroLibra.setForeground(new java.awt.Color(255, 102, 255));
        tfNumeroLibra.setText("6");

        javax.swing.GroupLayout areaInformacoes6Layout = new javax.swing.GroupLayout(areaInformacoes6);
        areaInformacoes6.setLayout(areaInformacoes6Layout);
        areaInformacoes6Layout.setHorizontalGroup(
            areaInformacoes6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes6Layout.createSequentialGroup()
                .addGroup(areaInformacoes6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoes6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imgSignoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(areaInformacoes6Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(areaInformacoes6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(areaInformacoes6Layout.createSequentialGroup()
                                .addGroup(areaInformacoes6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(areaInformacoes6Layout.createSequentialGroup()
                                        .addComponent(elementoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfElementosLibra))
                                    .addGroup(areaInformacoes6Layout.createSequentialGroup()
                                        .addComponent(corLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCorLibra))
                                    .addGroup(areaInformacoes6Layout.createSequentialGroup()
                                        .addComponent(planetaLibra)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPlanetaLibra))
                                    .addGroup(areaInformacoes6Layout.createSequentialGroup()
                                        .addComponent(numeroLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfNumeroLibra))
                                    .addGroup(areaInformacoes6Layout.createSequentialGroup()
                                        .addComponent(periodoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPeriodoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 17, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        areaInformacoes6Layout.setVerticalGroup(
            areaInformacoes6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaInformacoes6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(areaInformacoes6Layout.createSequentialGroup()
                        .addGroup(areaInformacoes6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(areaInformacoes6Layout.createSequentialGroup()
                                .addComponent(imgSignoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tituloLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(periodoLibra))
                            .addComponent(tfPeriodoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(areaInformacoes6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(elementoLibra)
                            .addComponent(tfElementosLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(planetaLibra))
                    .addComponent(tfPlanetaLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(corLibra)
                    .addComponent(tfCorLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numeroLibra, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfNumeroLibra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        fundoLibra.add(areaInformacoes6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, 690));

        tituloCaracterísticas6.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        tituloCaracterísticas6.setText("Características");

        pfortesLibra.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        pfortesLibra.setText("Pontos Fortes:");

        pMelhoriasLibra.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        pMelhoriasLibra.setText("Pontos a Melhorar:");

        txFortesLibra.setColumns(20);
        txFortesLibra.setRows(5);
        txFortesLibra.setText("Libra é frequentemente associado à diplomacia, educação e capacidade de encontrar equilíbrio. É um signo que costuma valorizar relacionamentos e tentar evitar conflitos desnecessários. Pode ter facilidade para conversar com pessoas diferentes e encontrar pontos em comum.");
        jScrollPane14.setViewportView(txFortesLibra);

        txMelhorarLibra.setColumns(20);
        txMelhorarLibra.setRows(5);
        txMelhorarLibra.setText("A indecisão pode ser um dos principais desafios de Libra. Por analisar diferentes lados de uma situação, pode ter dificuldade para escolher uma opção. Também pode evitar dizer \"não\" para não decepcionar alguém, mesmo quando não está confortável com determinada situação. Isso pode fazer com que acumule sentimentos.");
        jScrollPane15.setViewportView(txMelhorarLibra);

        javax.swing.GroupLayout areaCaracteristicas6Layout = new javax.swing.GroupLayout(areaCaracteristicas6);
        areaCaracteristicas6.setLayout(areaCaracteristicas6Layout);
        areaCaracteristicas6Layout.setHorizontalGroup(
            areaCaracteristicas6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(areaCaracteristicas6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tituloCaracterísticas6, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pfortesLibra)
                    .addComponent(pMelhoriasLibra)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(jScrollPane15))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        areaCaracteristicas6Layout.setVerticalGroup(
            areaCaracteristicas6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tituloCaracterísticas6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pfortesLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhoriasLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        fundoLibra.add(areaCaracteristicas6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 300, 320));

        tituloEnergiaLibra.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        tituloEnergiaLibra.setText("Energia do Dia:");

        amorLibra.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        amorLibra.setText("Amor:");

        tfAmorLibra.setText("94%");

        trabalhoLibra.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        trabalhoLibra.setText("Trabalho:");

        tfTrabalhoLibra.setText("84%");

        saudeLibra.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        saudeLibra.setText("Saúde:");

        tfSaudeLibra.setText("80%");

        sorteLibra.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        sorteLibra.setText("Sorte:");

        tfSorteLibra.setText("87%");

        javax.swing.GroupLayout areaEnergia6Layout = new javax.swing.GroupLayout(areaEnergia6);
        areaEnergia6.setLayout(areaEnergia6Layout);
        areaEnergia6Layout.setHorizontalGroup(
            areaEnergia6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia6Layout.createSequentialGroup()
                .addGroup(areaEnergia6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergia6Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(tituloEnergiaLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaEnergia6Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(areaEnergia6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfTrabalhoLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(trabalhoLibra)
                            .addComponent(tfAmorLibra)
                            .addComponent(amorLibra)
                            .addComponent(saudeLibra)
                            .addComponent(tfSaudeLibra)
                            .addComponent(sorteLibra)
                            .addComponent(tfSorteLibra))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        areaEnergia6Layout.setVerticalGroup(
            areaEnergia6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amorLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trabalhoLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sorteLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        fundoLibra.add(areaEnergia6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 50, 320, 300));

        tituloMensagemLibra.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        tituloMensagemLibra.setText("Mensagem do dia");

        btnCopiarMsgLibra.setBackground(new java.awt.Color(51, 51, 51));
        btnCopiarMsgLibra.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        btnCopiarMsgLibra.setForeground(new java.awt.Color(255, 102, 255));
        btnCopiarMsgLibra.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagem6Layout = new javax.swing.GroupLayout(areaMensagem6);
        areaMensagem6.setLayout(areaMensagem6Layout);
        areaMensagem6Layout.setHorizontalGroup(
            areaMensagem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaMensagem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagem6Layout.createSequentialGroup()
                        .addComponent(tituloMensagemLibra)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txMensagemLibra))
                .addContainerGap())
            .addGroup(areaMensagem6Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnCopiarMsgLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        areaMensagem6Layout.setVerticalGroup(
            areaMensagem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txMensagemLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCopiarMsgLibra)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fundoLibra.add(areaMensagem6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 410, 320, 230));

        fundolibra.setIcon(new javax.swing.ImageIcon("C:\\Users\\KawanDantas\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Libra.jpg")); // NOI18N
        fundoLibra.add(fundolibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        areasAbas.addTab("Libra", fundoLibra);

        fundoEscorpião.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaPrevisao7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        areaPrevisao7.setText("Previsão do Dia:");

        btnAtualizarPrevisaoEscorpiao.setBackground(new java.awt.Color(51, 51, 51));
        btnAtualizarPrevisaoEscorpiao.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        btnAtualizarPrevisaoEscorpiao.setForeground(new java.awt.Color(255, 0, 102));
        btnAtualizarPrevisaoEscorpiao.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisoes7Layout = new javax.swing.GroupLayout(areaPrevisoes7);
        areaPrevisoes7.setLayout(areaPrevisoes7Layout);
        areaPrevisoes7Layout.setHorizontalGroup(
            areaPrevisoes7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoes7Layout.createSequentialGroup()
                .addGroup(areaPrevisoes7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoes7Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(areaPrevisoes7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(areaPrevisao7, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txPrevisaoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaPrevisoes7Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnAtualizarPrevisaoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        areaPrevisoes7Layout.setVerticalGroup(
            areaPrevisoes7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoes7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(areaPrevisao7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtualizarPrevisaoEscorpiao)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        fundoEscorpião.add(areaPrevisoes7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 300, 250));

        imgSignoEscorpiao.setIcon(new javax.swing.ImageIcon("C:\\Users\\KawanDantas\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Escorpiao.jpg")); // NOI18N

        tituloEscorpiao.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        tituloEscorpiao.setText("ESCORPIÃO");

        periodoEscorpiao.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        periodoEscorpiao.setText("PERIODO:");

        elementoEscorpiao.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        elementoEscorpiao.setText("ELEMENTO:");

        planetaEscorpiao.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        planetaEscorpiao.setText("PLANETA REGENTE:");

        corEscorpiao.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        corEscorpiao.setText("COR:");

        numeroEscorpiao.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        numeroEscorpiao.setText("NÚMERO DA SORTE:");

        tfPeriodoEscorpiao.setBackground(new java.awt.Color(0, 0, 0));
        tfPeriodoEscorpiao.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfPeriodoEscorpiao.setForeground(new java.awt.Color(255, 0, 102));
        tfPeriodoEscorpiao.setText("23/10 a 21/11");

        tfElementosEscorpiao.setBackground(new java.awt.Color(0, 0, 0));
        tfElementosEscorpiao.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfElementosEscorpiao.setForeground(new java.awt.Color(255, 0, 102));
        tfElementosEscorpiao.setText("Água");

        tfPlanetaEscorpiao.setBackground(new java.awt.Color(0, 0, 0));
        tfPlanetaEscorpiao.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfPlanetaEscorpiao.setForeground(new java.awt.Color(255, 0, 102));
        tfPlanetaEscorpiao.setText("Plutão");

        tfCorEscorpiao.setBackground(new java.awt.Color(0, 0, 0));
        tfCorEscorpiao.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfCorEscorpiao.setForeground(new java.awt.Color(255, 0, 102));
        tfCorEscorpiao.setText("Vermelho-escuro/Preto");

        tfNumeroEscorpiao.setBackground(new java.awt.Color(0, 0, 0));
        tfNumeroEscorpiao.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfNumeroEscorpiao.setForeground(new java.awt.Color(255, 0, 102));
        tfNumeroEscorpiao.setText("8");

        javax.swing.GroupLayout areaInformacoes7Layout = new javax.swing.GroupLayout(areaInformacoes7);
        areaInformacoes7.setLayout(areaInformacoes7Layout);
        areaInformacoes7Layout.setHorizontalGroup(
            areaInformacoes7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes7Layout.createSequentialGroup()
                .addGroup(areaInformacoes7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoes7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imgSignoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(areaInformacoes7Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(areaInformacoes7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(areaInformacoes7Layout.createSequentialGroup()
                                .addGroup(areaInformacoes7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(areaInformacoes7Layout.createSequentialGroup()
                                        .addComponent(elementoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfElementosEscorpiao))
                                    .addGroup(areaInformacoes7Layout.createSequentialGroup()
                                        .addComponent(corEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCorEscorpiao))
                                    .addGroup(areaInformacoes7Layout.createSequentialGroup()
                                        .addComponent(planetaEscorpiao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPlanetaEscorpiao))
                                    .addGroup(areaInformacoes7Layout.createSequentialGroup()
                                        .addComponent(numeroEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfNumeroEscorpiao))
                                    .addGroup(areaInformacoes7Layout.createSequentialGroup()
                                        .addComponent(periodoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPeriodoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 17, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        areaInformacoes7Layout.setVerticalGroup(
            areaInformacoes7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaInformacoes7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(areaInformacoes7Layout.createSequentialGroup()
                        .addGroup(areaInformacoes7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(areaInformacoes7Layout.createSequentialGroup()
                                .addComponent(imgSignoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tituloEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(periodoEscorpiao))
                            .addComponent(tfPeriodoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(areaInformacoes7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(elementoEscorpiao)
                            .addComponent(tfElementosEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(planetaEscorpiao))
                    .addComponent(tfPlanetaEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(corEscorpiao)
                    .addComponent(tfCorEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numeroEscorpiao, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfNumeroEscorpiao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        fundoEscorpião.add(areaInformacoes7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, 690));

        tituloCaracterísticas7.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        tituloCaracterísticas7.setText("Características");

        pfortesEscorpiao.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        pfortesEscorpiao.setText("Pontos Fortes:");

        pMelhoriasEscorpiao.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        pMelhoriasEscorpiao.setText("Pontos a Melhorar:");

        txFortesEscorpiao.setColumns(20);
        txFortesEscorpiao.setRows(5);
        txFortesEscorpiao.setText("Escorpião costuma ser associado à intensidade, determinação e profundidade emocional. É um signo que geralmente não gosta de relações superficiais e valoriza confiança. Quando estabelece um vínculo com alguém, pode ser extremamente leal e protetor.");
        jScrollPane16.setViewportView(txFortesEscorpiao);

        txMelhorarEscorpiao.setColumns(20);
        txMelhorarEscorpiao.setRows(5);
        txMelhorarEscorpiao.setText("A desconfiança pode ser um desafio importante. Quando se sente inseguro, Escorpião pode começar a imaginar diferentes possibilidades antes de ter certeza dos fatos. O ciúme e a dificuldade de esquecer determinadas situações também podem aparecer.");
        jScrollPane17.setViewportView(txMelhorarEscorpiao);

        javax.swing.GroupLayout areaCaracteristicas7Layout = new javax.swing.GroupLayout(areaCaracteristicas7);
        areaCaracteristicas7.setLayout(areaCaracteristicas7Layout);
        areaCaracteristicas7Layout.setHorizontalGroup(
            areaCaracteristicas7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(areaCaracteristicas7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tituloCaracterísticas7, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pfortesEscorpiao)
                    .addComponent(pMelhoriasEscorpiao)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(jScrollPane17))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        areaCaracteristicas7Layout.setVerticalGroup(
            areaCaracteristicas7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tituloCaracterísticas7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pfortesEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhoriasEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        fundoEscorpião.add(areaCaracteristicas7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 300, 320));

        tituloEnergiaEscorpiao.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        tituloEnergiaEscorpiao.setText("Energia do Dia:");

        amorEscorpiao.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        amorEscorpiao.setText("Amor:");

        tfAmorEscorpiao.setText("96%");

        trabalhoEscorpiao.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        trabalhoEscorpiao.setText("Trabalho:");

        tfTrabalhoEscorpiao.setText("93%");

        saudeEscorpiao.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        saudeEscorpiao.setText("Saúde:");

        tfSaudeEsorpiao.setText("83%");

        sorteEscorpiao.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        sorteEscorpiao.setText("Sorte:");

        tfSorteEscorpiao.setText("91%");

        javax.swing.GroupLayout areaEnergia7Layout = new javax.swing.GroupLayout(areaEnergia7);
        areaEnergia7.setLayout(areaEnergia7Layout);
        areaEnergia7Layout.setHorizontalGroup(
            areaEnergia7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia7Layout.createSequentialGroup()
                .addGroup(areaEnergia7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergia7Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(tituloEnergiaEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaEnergia7Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(areaEnergia7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfTrabalhoEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(trabalhoEscorpiao)
                            .addComponent(tfAmorEscorpiao)
                            .addComponent(amorEscorpiao)
                            .addComponent(saudeEscorpiao)
                            .addComponent(tfSaudeEsorpiao)
                            .addComponent(sorteEscorpiao)
                            .addComponent(tfSorteEscorpiao))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        areaEnergia7Layout.setVerticalGroup(
            areaEnergia7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amorEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trabalhoEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeEsorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sorteEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        fundoEscorpião.add(areaEnergia7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 50, 320, 300));

        tituloMensagemEscorpiao.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        tituloMensagemEscorpiao.setText("Mensagem do dia");

        btnCopiarMsgEscorpiao.setBackground(new java.awt.Color(51, 51, 51));
        btnCopiarMsgEscorpiao.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        btnCopiarMsgEscorpiao.setForeground(new java.awt.Color(255, 0, 102));
        btnCopiarMsgEscorpiao.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagem7Layout = new javax.swing.GroupLayout(areaMensagem7);
        areaMensagem7.setLayout(areaMensagem7Layout);
        areaMensagem7Layout.setHorizontalGroup(
            areaMensagem7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaMensagem7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagem7Layout.createSequentialGroup()
                        .addComponent(tituloMensagemEscorpiao)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txMensagemEscorpiao))
                .addContainerGap())
            .addGroup(areaMensagem7Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnCopiarMsgEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        areaMensagem7Layout.setVerticalGroup(
            areaMensagem7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txMensagemEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCopiarMsgEscorpiao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fundoEscorpião.add(areaMensagem7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 410, 320, 230));

        fundoescorpiao.setIcon(new javax.swing.ImageIcon("C:\\Users\\KawanDantas\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Escorpiao.jpg")); // NOI18N
        fundoEscorpião.add(fundoescorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        areasAbas.addTab("Escorpião", fundoEscorpião);

        fundoSagitario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaPrevisao8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        areaPrevisao8.setText("Previsão do Dia:");

        btnAtualizarPrevisaoSagitario.setBackground(new java.awt.Color(51, 51, 51));
        btnAtualizarPrevisaoSagitario.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        btnAtualizarPrevisaoSagitario.setForeground(new java.awt.Color(102, 102, 255));
        btnAtualizarPrevisaoSagitario.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisoes8Layout = new javax.swing.GroupLayout(areaPrevisoes8);
        areaPrevisoes8.setLayout(areaPrevisoes8Layout);
        areaPrevisoes8Layout.setHorizontalGroup(
            areaPrevisoes8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoes8Layout.createSequentialGroup()
                .addGroup(areaPrevisoes8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoes8Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(areaPrevisoes8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(areaPrevisao8, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txPrevisaoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaPrevisoes8Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnAtualizarPrevisaoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        areaPrevisoes8Layout.setVerticalGroup(
            areaPrevisoes8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoes8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(areaPrevisao8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtualizarPrevisaoSagitario)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        fundoSagitario.add(areaPrevisoes8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 300, 250));

        imgSignoSagitario.setIcon(new javax.swing.ImageIcon("C:\\Users\\KawanDantas\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Sagitario.jpg")); // NOI18N

        tituloSagitario.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        tituloSagitario.setText("SAGITÁRIO");

        periodoSagitario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        periodoSagitario.setText("PERIODO:");

        elementoSagitario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        elementoSagitario.setText("ELEMENTO:");

        planetaSagitario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        planetaSagitario.setText("PLANETA REGENTE:");

        corSagitario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        corSagitario.setText("COR:");

        numeroSagitario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        numeroSagitario.setText("NÚMERO DA SORTE:");

        tfPeriodoSagitario.setBackground(new java.awt.Color(0, 0, 0));
        tfPeriodoSagitario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfPeriodoSagitario.setForeground(new java.awt.Color(102, 102, 255));
        tfPeriodoSagitario.setText("22/11 a 21/12");

        tfElementosSagitario.setBackground(new java.awt.Color(0, 0, 0));
        tfElementosSagitario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfElementosSagitario.setForeground(new java.awt.Color(102, 102, 255));
        tfElementosSagitario.setText("Fogo");

        tfPlanetaSagitario.setBackground(new java.awt.Color(0, 0, 0));
        tfPlanetaSagitario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfPlanetaSagitario.setForeground(new java.awt.Color(102, 102, 255));
        tfPlanetaSagitario.setText("Júpiter");

        tfCorSagitario.setBackground(new java.awt.Color(0, 0, 0));
        tfCorSagitario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfCorSagitario.setForeground(new java.awt.Color(102, 102, 255));
        tfCorSagitario.setText("Roxo/Azul");

        tfNumeroSagitario.setBackground(new java.awt.Color(0, 0, 0));
        tfNumeroSagitario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfNumeroSagitario.setForeground(new java.awt.Color(102, 102, 255));
        tfNumeroSagitario.setText("3");

        javax.swing.GroupLayout areaInformacoes8Layout = new javax.swing.GroupLayout(areaInformacoes8);
        areaInformacoes8.setLayout(areaInformacoes8Layout);
        areaInformacoes8Layout.setHorizontalGroup(
            areaInformacoes8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes8Layout.createSequentialGroup()
                .addGroup(areaInformacoes8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoes8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imgSignoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(areaInformacoes8Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(areaInformacoes8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(areaInformacoes8Layout.createSequentialGroup()
                                .addGroup(areaInformacoes8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(areaInformacoes8Layout.createSequentialGroup()
                                        .addComponent(elementoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfElementosSagitario))
                                    .addGroup(areaInformacoes8Layout.createSequentialGroup()
                                        .addComponent(corSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCorSagitario))
                                    .addGroup(areaInformacoes8Layout.createSequentialGroup()
                                        .addComponent(planetaSagitario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPlanetaSagitario))
                                    .addGroup(areaInformacoes8Layout.createSequentialGroup()
                                        .addComponent(numeroSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfNumeroSagitario))
                                    .addGroup(areaInformacoes8Layout.createSequentialGroup()
                                        .addComponent(periodoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPeriodoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 17, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        areaInformacoes8Layout.setVerticalGroup(
            areaInformacoes8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaInformacoes8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(areaInformacoes8Layout.createSequentialGroup()
                        .addGroup(areaInformacoes8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(areaInformacoes8Layout.createSequentialGroup()
                                .addComponent(imgSignoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tituloSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(periodoSagitario))
                            .addComponent(tfPeriodoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(areaInformacoes8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(elementoSagitario)
                            .addComponent(tfElementosSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(planetaSagitario))
                    .addComponent(tfPlanetaSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(corSagitario)
                    .addComponent(tfCorSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numeroSagitario, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfNumeroSagitario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        fundoSagitario.add(areaInformacoes8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, 690));

        tituloCaracterísticas8.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        tituloCaracterísticas8.setText("Características");

        pfortesSagitario.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        pfortesSagitario.setText("Pontos Fortes:");

        pMelhoriasSagitario.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        pMelhoriasSagitario.setText("Pontos a Melhorar:");

        txFortesSagitario.setColumns(20);
        txFortesSagitario.setRows(5);
        txFortesSagitario.setText("Sagitário costuma ser associado à liberdade, aventura e otimismo. É um signo que geralmente gosta de conhecer lugares, pessoas e ideias diferentes. Pode ter uma personalidade divertida e gostar de experiências novas. Também costuma demonstrar sinceridade e entusiasmo quando acredita em alguma coisa.");
        jScrollPane18.setViewportView(txFortesSagitario);

        txMelhorarSagitario.setColumns(20);
        txMelhorarSagitario.setRows(5);
        txMelhorarSagitario.setText("A sinceridade de Sagitário pode às vezes ultrapassar o limite e acabar magoando alguém. Nem sempre aquilo que é pensado precisa ser dito exatamente da mesma maneira. A impulsividade também pode fazer com que tome decisões sem pensar muito nas consequências. Além disso, pode ter dificuldade com situações muito repetitivas ou rotineiras.");
        jScrollPane19.setViewportView(txMelhorarSagitario);

        javax.swing.GroupLayout areaCaracteristicas8Layout = new javax.swing.GroupLayout(areaCaracteristicas8);
        areaCaracteristicas8.setLayout(areaCaracteristicas8Layout);
        areaCaracteristicas8Layout.setHorizontalGroup(
            areaCaracteristicas8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas8Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(areaCaracteristicas8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tituloCaracterísticas8, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pfortesSagitario)
                    .addComponent(pMelhoriasSagitario)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(jScrollPane19))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        areaCaracteristicas8Layout.setVerticalGroup(
            areaCaracteristicas8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas8Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tituloCaracterísticas8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pfortesSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhoriasSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        fundoSagitario.add(areaCaracteristicas8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 300, 320));

        tituloEnergiaSagitario.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        tituloEnergiaSagitario.setText("Energia do Dia:");

        amorSagitario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        amorSagitario.setText("Amor:");

        tfAmorSagitario.setText("88%");

        trabalhoSagitario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        trabalhoSagitario.setText("Trabalho:");

        tfTrabalhoSagitario.setText("89%");

        saudeSagitario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        saudeSagitario.setText("Saúde:");

        tfSaudeSagitario.setText("86%");

        sorteSagitario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        sorteSagitario.setText("Sorte:");

        tfSorteSagitario.setText("96%");

        javax.swing.GroupLayout areaEnergia8Layout = new javax.swing.GroupLayout(areaEnergia8);
        areaEnergia8.setLayout(areaEnergia8Layout);
        areaEnergia8Layout.setHorizontalGroup(
            areaEnergia8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia8Layout.createSequentialGroup()
                .addGroup(areaEnergia8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergia8Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(tituloEnergiaSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaEnergia8Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(areaEnergia8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfTrabalhoSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(trabalhoSagitario)
                            .addComponent(tfAmorSagitario)
                            .addComponent(amorSagitario)
                            .addComponent(saudeSagitario)
                            .addComponent(tfSaudeSagitario)
                            .addComponent(sorteSagitario)
                            .addComponent(tfSorteSagitario))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        areaEnergia8Layout.setVerticalGroup(
            areaEnergia8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amorSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trabalhoSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sorteSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        fundoSagitario.add(areaEnergia8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 50, 320, 300));

        tituloMensagemSagitario.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        tituloMensagemSagitario.setText("Mensagem do dia");

        btnCopiarMsgSagitario.setBackground(new java.awt.Color(51, 51, 51));
        btnCopiarMsgSagitario.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        btnCopiarMsgSagitario.setForeground(new java.awt.Color(102, 102, 255));
        btnCopiarMsgSagitario.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagem8Layout = new javax.swing.GroupLayout(areaMensagem8);
        areaMensagem8.setLayout(areaMensagem8Layout);
        areaMensagem8Layout.setHorizontalGroup(
            areaMensagem8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaMensagem8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagem8Layout.createSequentialGroup()
                        .addComponent(tituloMensagemSagitario)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txMensagemSagitario))
                .addContainerGap())
            .addGroup(areaMensagem8Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnCopiarMsgSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        areaMensagem8Layout.setVerticalGroup(
            areaMensagem8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txMensagemSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCopiarMsgSagitario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fundoSagitario.add(areaMensagem8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 410, 320, 230));

        fundosagitario.setIcon(new javax.swing.ImageIcon("C:\\Users\\KawanDantas\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Sagitario.jpg")); // NOI18N
        fundoSagitario.add(fundosagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        areasAbas.addTab("Sagitário", fundoSagitario);

        fundoCapricornio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaPrevisao9.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        areaPrevisao9.setText("Previsão do Dia:");

        btnAtualizarPrevisaoCapricornio.setBackground(new java.awt.Color(51, 51, 51));
        btnAtualizarPrevisaoCapricornio.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        btnAtualizarPrevisaoCapricornio.setForeground(new java.awt.Color(0, 204, 0));
        btnAtualizarPrevisaoCapricornio.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisoes9Layout = new javax.swing.GroupLayout(areaPrevisoes9);
        areaPrevisoes9.setLayout(areaPrevisoes9Layout);
        areaPrevisoes9Layout.setHorizontalGroup(
            areaPrevisoes9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoes9Layout.createSequentialGroup()
                .addGroup(areaPrevisoes9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoes9Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(areaPrevisoes9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(areaPrevisao9, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txPrevisaoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaPrevisoes9Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnAtualizarPrevisaoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        areaPrevisoes9Layout.setVerticalGroup(
            areaPrevisoes9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoes9Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(areaPrevisao9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtualizarPrevisaoCapricornio)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        fundoCapricornio.add(areaPrevisoes9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 300, 250));

        imgSignoCapricornio.setIcon(new javax.swing.ImageIcon("C:\\Users\\KawanDantas\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Capricornio.jpg")); // NOI18N

        tituloCapricornio.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        tituloCapricornio.setText("CAPRICÓRNIO");

        periodoCapricornio.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        periodoCapricornio.setText("PERIODO:");

        elementoCapricornio.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        elementoCapricornio.setText("ELEMENTO:");

        planetaCapricornio.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        planetaCapricornio.setText("PLANETA REGENTE:");

        corCapricornio.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        corCapricornio.setText("COR:");

        numeroCapricornio.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        numeroCapricornio.setText("NÚMERO DA SORTE:");

        tfPeriodoCapricornio.setBackground(new java.awt.Color(0, 0, 0));
        tfPeriodoCapricornio.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfPeriodoCapricornio.setForeground(new java.awt.Color(0, 204, 0));
        tfPeriodoCapricornio.setText("22//12 a 19/01");

        tfElementosCapricornio.setBackground(new java.awt.Color(0, 0, 0));
        tfElementosCapricornio.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfElementosCapricornio.setForeground(new java.awt.Color(0, 204, 0));
        tfElementosCapricornio.setText("Terra");

        tfPlanetaCapricornio.setBackground(new java.awt.Color(0, 0, 0));
        tfPlanetaCapricornio.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfPlanetaCapricornio.setForeground(new java.awt.Color(0, 204, 0));
        tfPlanetaCapricornio.setText("Saturno");

        tfCorCapricornio.setBackground(new java.awt.Color(0, 0, 0));
        tfCorCapricornio.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfCorCapricornio.setForeground(new java.awt.Color(0, 204, 0));
        tfCorCapricornio.setText("Preto/Cinza");

        tfNumeroCapricornio.setBackground(new java.awt.Color(0, 0, 0));
        tfNumeroCapricornio.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfNumeroCapricornio.setForeground(new java.awt.Color(0, 204, 0));
        tfNumeroCapricornio.setText("8");

        javax.swing.GroupLayout areaInformacoes9Layout = new javax.swing.GroupLayout(areaInformacoes9);
        areaInformacoes9.setLayout(areaInformacoes9Layout);
        areaInformacoes9Layout.setHorizontalGroup(
            areaInformacoes9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes9Layout.createSequentialGroup()
                .addGroup(areaInformacoes9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoes9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imgSignoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(areaInformacoes9Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(areaInformacoes9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(areaInformacoes9Layout.createSequentialGroup()
                                .addGroup(areaInformacoes9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(areaInformacoes9Layout.createSequentialGroup()
                                        .addComponent(elementoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfElementosCapricornio))
                                    .addGroup(areaInformacoes9Layout.createSequentialGroup()
                                        .addComponent(corCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCorCapricornio))
                                    .addGroup(areaInformacoes9Layout.createSequentialGroup()
                                        .addComponent(planetaCapricornio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPlanetaCapricornio))
                                    .addGroup(areaInformacoes9Layout.createSequentialGroup()
                                        .addComponent(numeroCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfNumeroCapricornio))
                                    .addGroup(areaInformacoes9Layout.createSequentialGroup()
                                        .addComponent(periodoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPeriodoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 17, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        areaInformacoes9Layout.setVerticalGroup(
            areaInformacoes9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaInformacoes9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(areaInformacoes9Layout.createSequentialGroup()
                        .addGroup(areaInformacoes9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(areaInformacoes9Layout.createSequentialGroup()
                                .addComponent(imgSignoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tituloCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(periodoCapricornio))
                            .addComponent(tfPeriodoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(areaInformacoes9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(elementoCapricornio)
                            .addComponent(tfElementosCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(planetaCapricornio))
                    .addComponent(tfPlanetaCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(corCapricornio)
                    .addComponent(tfCorCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numeroCapricornio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfNumeroCapricornio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        fundoCapricornio.add(areaInformacoes9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, 690));

        tituloCaracterísticas9.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        tituloCaracterísticas9.setText("Características");

        pfortesCapricornio.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        pfortesCapricornio.setText("Pontos Fortes:");

        pMelhoriasCapricornio.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        pMelhoriasCapricornio.setText("Pontos a Melhorar:");

        txFortesCapricornio.setColumns(20);
        txFortesCapricornio.setRows(5);
        txFortesCapricornio.setText("Capricórnio costuma ser associado à responsabilidade, disciplina e ambição. É um signo que pode levar objetivos muito a sério e estar disposto a trabalhar durante bastante tempo para alcançá-los. Geralmente valoriza estabilidade e segurança e pode pensar bastante no futuro antes de tomar decisões.");
        jScrollPane20.setViewportView(txFortesCapricornio);

        txMelhorarCapricornio.setColumns(20);
        txMelhorarCapricornio.setRows(5);
        txMelhorarCapricornio.setText("Capricórnio pode acabar colocando muita pressão sobre si mesmo. A busca por resultados pode fazer com que se esqueça de descansar ou aproveitar o presente. Também pode parecer distante quando, na verdade, está apenas tentando resolver seus problemas sozinho.");
        jScrollPane21.setViewportView(txMelhorarCapricornio);

        javax.swing.GroupLayout areaCaracteristicas9Layout = new javax.swing.GroupLayout(areaCaracteristicas9);
        areaCaracteristicas9.setLayout(areaCaracteristicas9Layout);
        areaCaracteristicas9Layout.setHorizontalGroup(
            areaCaracteristicas9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas9Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(areaCaracteristicas9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tituloCaracterísticas9, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pfortesCapricornio)
                    .addComponent(pMelhoriasCapricornio)
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(jScrollPane21))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        areaCaracteristicas9Layout.setVerticalGroup(
            areaCaracteristicas9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas9Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tituloCaracterísticas9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pfortesCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhoriasCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        fundoCapricornio.add(areaCaracteristicas9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 300, 320));

        tituloEnergiaCapricornio.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        tituloEnergiaCapricornio.setText("Energia do Dia:");

        amorCapricornio.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        amorCapricornio.setText("Amor:");

        tfAmorCapricornio.setText("80%");

        trabalhoCapricornio.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        trabalhoCapricornio.setText("Trabalho:");

        tfTrabalhoCapricornio.setText("98%");

        saudeCapricornio.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        saudeCapricornio.setText("Saúde:");

        tfSaudeCapricornio.setText("91%");

        sorteCapricornio.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        sorteCapricornio.setText("Sorte:");

        tfSorteCapricornio.setText("82%");

        javax.swing.GroupLayout areaEnergia9Layout = new javax.swing.GroupLayout(areaEnergia9);
        areaEnergia9.setLayout(areaEnergia9Layout);
        areaEnergia9Layout.setHorizontalGroup(
            areaEnergia9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia9Layout.createSequentialGroup()
                .addGroup(areaEnergia9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergia9Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(tituloEnergiaCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaEnergia9Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(areaEnergia9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfTrabalhoCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(trabalhoCapricornio)
                            .addComponent(tfAmorCapricornio)
                            .addComponent(amorCapricornio)
                            .addComponent(saudeCapricornio)
                            .addComponent(tfSaudeCapricornio)
                            .addComponent(sorteCapricornio)
                            .addComponent(tfSorteCapricornio))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        areaEnergia9Layout.setVerticalGroup(
            areaEnergia9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amorCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trabalhoCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sorteCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        fundoCapricornio.add(areaEnergia9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 50, 320, 300));

        tituloMensagemCapricornio.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        tituloMensagemCapricornio.setText("Mensagem do dia");

        btnCopiarMsgCapricornio.setBackground(new java.awt.Color(51, 51, 51));
        btnCopiarMsgCapricornio.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        btnCopiarMsgCapricornio.setForeground(new java.awt.Color(0, 204, 0));
        btnCopiarMsgCapricornio.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagem9Layout = new javax.swing.GroupLayout(areaMensagem9);
        areaMensagem9.setLayout(areaMensagem9Layout);
        areaMensagem9Layout.setHorizontalGroup(
            areaMensagem9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaMensagem9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagem9Layout.createSequentialGroup()
                        .addComponent(tituloMensagemCapricornio)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txMensagemCapricornio))
                .addContainerGap())
            .addGroup(areaMensagem9Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnCopiarMsgCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        areaMensagem9Layout.setVerticalGroup(
            areaMensagem9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txMensagemCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCopiarMsgCapricornio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fundoCapricornio.add(areaMensagem9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 410, 320, 230));

        fundocapricornio.setIcon(new javax.swing.ImageIcon("C:\\Users\\KawanDantas\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Capricornio.jpg")); // NOI18N
        fundoCapricornio.add(fundocapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        areasAbas.addTab("Capricórnio", fundoCapricornio);

        fundoAquario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaPrevisao10.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        areaPrevisao10.setText("Previsão do Dia:");

        btnAtualizarPrevisaoAquario.setBackground(new java.awt.Color(51, 51, 51));
        btnAtualizarPrevisaoAquario.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        btnAtualizarPrevisaoAquario.setForeground(new java.awt.Color(51, 204, 255));
        btnAtualizarPrevisaoAquario.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisoes10Layout = new javax.swing.GroupLayout(areaPrevisoes10);
        areaPrevisoes10.setLayout(areaPrevisoes10Layout);
        areaPrevisoes10Layout.setHorizontalGroup(
            areaPrevisoes10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoes10Layout.createSequentialGroup()
                .addGroup(areaPrevisoes10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoes10Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(areaPrevisoes10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(areaPrevisao10, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txPrevisaoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaPrevisoes10Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnAtualizarPrevisaoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        areaPrevisoes10Layout.setVerticalGroup(
            areaPrevisoes10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoes10Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(areaPrevisao10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtualizarPrevisaoAquario)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        fundoAquario.add(areaPrevisoes10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 300, 250));

        imgSignoAquario.setIcon(new javax.swing.ImageIcon("C:\\Users\\KawanDantas\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Aquario.jpg")); // NOI18N

        tituloAquario.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        tituloAquario.setText("AQUÁRIO");

        periodoAquario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        periodoAquario.setText("PERIODO:");

        elementoAquario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        elementoAquario.setText("ELEMENTO:");

        planetaAquario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        planetaAquario.setText("PLANETA REGENTE:");

        corAquario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        corAquario.setText("COR:");

        numeroAquario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        numeroAquario.setText("NÚMERO DA SORTE:");

        tfPeriodoAquario.setBackground(new java.awt.Color(0, 0, 0));
        tfPeriodoAquario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfPeriodoAquario.setForeground(new java.awt.Color(51, 204, 255));
        tfPeriodoAquario.setText("20/01 a 18/02");

        tfElementosAquario.setBackground(new java.awt.Color(0, 0, 0));
        tfElementosAquario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfElementosAquario.setForeground(new java.awt.Color(51, 204, 255));
        tfElementosAquario.setText("Ar");

        tfPlanetaAquario.setBackground(new java.awt.Color(0, 0, 0));
        tfPlanetaAquario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfPlanetaAquario.setForeground(new java.awt.Color(51, 204, 255));
        tfPlanetaAquario.setText("Urano");

        tfCorAquario.setBackground(new java.awt.Color(0, 0, 0));
        tfCorAquario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfCorAquario.setForeground(new java.awt.Color(51, 204, 255));
        tfCorAquario.setText("Azul/Turquesa");

        tfNumeroAquario.setBackground(new java.awt.Color(0, 0, 0));
        tfNumeroAquario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfNumeroAquario.setForeground(new java.awt.Color(51, 204, 255));
        tfNumeroAquario.setText("4");

        javax.swing.GroupLayout areaInformacoes10Layout = new javax.swing.GroupLayout(areaInformacoes10);
        areaInformacoes10.setLayout(areaInformacoes10Layout);
        areaInformacoes10Layout.setHorizontalGroup(
            areaInformacoes10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes10Layout.createSequentialGroup()
                .addGroup(areaInformacoes10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoes10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imgSignoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(areaInformacoes10Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(areaInformacoes10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(areaInformacoes10Layout.createSequentialGroup()
                                .addGroup(areaInformacoes10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(areaInformacoes10Layout.createSequentialGroup()
                                        .addComponent(elementoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfElementosAquario))
                                    .addGroup(areaInformacoes10Layout.createSequentialGroup()
                                        .addComponent(corAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCorAquario))
                                    .addGroup(areaInformacoes10Layout.createSequentialGroup()
                                        .addComponent(planetaAquario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPlanetaAquario))
                                    .addGroup(areaInformacoes10Layout.createSequentialGroup()
                                        .addComponent(numeroAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfNumeroAquario))
                                    .addGroup(areaInformacoes10Layout.createSequentialGroup()
                                        .addComponent(periodoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPeriodoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 17, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        areaInformacoes10Layout.setVerticalGroup(
            areaInformacoes10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaInformacoes10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(areaInformacoes10Layout.createSequentialGroup()
                        .addGroup(areaInformacoes10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(areaInformacoes10Layout.createSequentialGroup()
                                .addComponent(imgSignoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tituloAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(periodoAquario))
                            .addComponent(tfPeriodoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(areaInformacoes10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(elementoAquario)
                            .addComponent(tfElementosAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(planetaAquario))
                    .addComponent(tfPlanetaAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(corAquario)
                    .addComponent(tfCorAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numeroAquario, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfNumeroAquario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        fundoAquario.add(areaInformacoes10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, 690));

        tituloCaracterísticas10.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        tituloCaracterísticas10.setText("Características");

        pfortesAquario.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        pfortesAquario.setText("Pontos Fortes:");

        pMelhoriasAquario.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        pMelhoriasAquario.setText("Pontos a Melhorar:");

        txFortesAquario.setColumns(20);
        txFortesAquario.setRows(5);
        txFortesAquario.setText("Aquário costuma ser associado à criatividade, independência e originalidade. É um signo que pode gostar de pensar de maneira diferente e questionar ideias que considera ultrapassadas. Tem tendência a valorizar liberdade e pode gostar de descobrir novas tecnologias, assuntos e formas de enxergar o mundo.");
        jScrollPane22.setViewportView(txFortesAquario);

        txMelhorarAquario.setColumns(20);
        txMelhorarAquario.setRows(5);
        txMelhorarAquario.setText("A independência pode às vezes se transformar em dificuldade para aceitar conselhos ou opiniões diferentes. Aquário pode ficar tão concentrado em suas ideias que acaba parecendo distante emocionalmente.");
        jScrollPane23.setViewportView(txMelhorarAquario);

        javax.swing.GroupLayout areaCaracteristicas10Layout = new javax.swing.GroupLayout(areaCaracteristicas10);
        areaCaracteristicas10.setLayout(areaCaracteristicas10Layout);
        areaCaracteristicas10Layout.setHorizontalGroup(
            areaCaracteristicas10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas10Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(areaCaracteristicas10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tituloCaracterísticas10, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pfortesAquario)
                    .addComponent(pMelhoriasAquario)
                    .addComponent(jScrollPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(jScrollPane23))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        areaCaracteristicas10Layout.setVerticalGroup(
            areaCaracteristicas10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas10Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tituloCaracterísticas10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pfortesAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhoriasAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        fundoAquario.add(areaCaracteristicas10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 300, 320));

        tituloEnergiaAquario.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        tituloEnergiaAquario.setText("Energia do Dia:");

        amorAquario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        amorAquario.setText("Amor:");

        tfAmorAquario.setText("76%");

        trabalhoAquario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        trabalhoAquario.setText("Trabalho:");

        tfTrabalhoAquario.setText("91%");

        saudeAquario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        saudeAquario.setText("Saúde:");

        tfSaudeAquario.setText("79%");

        sorteAquario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        sorteAquario.setText("Sorte:");

        tfSorteAquario.setText("89%");

        javax.swing.GroupLayout areaEnergia10Layout = new javax.swing.GroupLayout(areaEnergia10);
        areaEnergia10.setLayout(areaEnergia10Layout);
        areaEnergia10Layout.setHorizontalGroup(
            areaEnergia10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia10Layout.createSequentialGroup()
                .addGroup(areaEnergia10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergia10Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(tituloEnergiaAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaEnergia10Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(areaEnergia10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfTrabalhoAquario, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(trabalhoAquario)
                            .addComponent(tfAmorAquario)
                            .addComponent(amorAquario)
                            .addComponent(saudeAquario)
                            .addComponent(tfSaudeAquario)
                            .addComponent(sorteAquario)
                            .addComponent(tfSorteAquario))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        areaEnergia10Layout.setVerticalGroup(
            areaEnergia10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amorAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trabalhoAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sorteAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        fundoAquario.add(areaEnergia10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 50, 320, 300));

        tituloMensagemAquario.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        tituloMensagemAquario.setText("Mensagem do dia");

        btnCopiarMsgAquario.setBackground(new java.awt.Color(51, 51, 51));
        btnCopiarMsgAquario.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        btnCopiarMsgAquario.setForeground(new java.awt.Color(51, 204, 255));
        btnCopiarMsgAquario.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagem10Layout = new javax.swing.GroupLayout(areaMensagem10);
        areaMensagem10.setLayout(areaMensagem10Layout);
        areaMensagem10Layout.setHorizontalGroup(
            areaMensagem10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaMensagem10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagem10Layout.createSequentialGroup()
                        .addComponent(tituloMensagemAquario)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txMensagemAquario))
                .addContainerGap())
            .addGroup(areaMensagem10Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnCopiarMsgAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        areaMensagem10Layout.setVerticalGroup(
            areaMensagem10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txMensagemAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCopiarMsgAquario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fundoAquario.add(areaMensagem10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 410, 320, 230));

        fundoaquario.setIcon(new javax.swing.ImageIcon("C:\\Users\\KawanDantas\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Aquario.jpg")); // NOI18N
        fundoAquario.add(fundoaquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        areasAbas.addTab("Aquário", fundoAquario);

        fundoPeixes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaPrevisao11.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        areaPrevisao11.setText("Previsão do Dia:");

        btnAtualizarPrevisaoPeixes.setBackground(new java.awt.Color(51, 51, 51));
        btnAtualizarPrevisaoPeixes.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        btnAtualizarPrevisaoPeixes.setForeground(new java.awt.Color(102, 102, 255));
        btnAtualizarPrevisaoPeixes.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisoes11Layout = new javax.swing.GroupLayout(areaPrevisoes11);
        areaPrevisoes11.setLayout(areaPrevisoes11Layout);
        areaPrevisoes11Layout.setHorizontalGroup(
            areaPrevisoes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoes11Layout.createSequentialGroup()
                .addGroup(areaPrevisoes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoes11Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(areaPrevisoes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(areaPrevisao11, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txPrevisaoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaPrevisoes11Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnAtualizarPrevisaoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        areaPrevisoes11Layout.setVerticalGroup(
            areaPrevisoes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoes11Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(areaPrevisao11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtualizarPrevisaoPeixes)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        fundoPeixes.add(areaPrevisoes11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 300, 250));

        imgSignoPeixes.setIcon(new javax.swing.ImageIcon("C:\\Users\\KawanDantas\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Peixes.jpg")); // NOI18N

        tituloPeixes.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        tituloPeixes.setText("PEIXES");

        periodoPeixes.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        periodoPeixes.setText("PERIODO:");

        elementoPeixes.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        elementoPeixes.setText("ELEMENTO:");

        planetaPeixes.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        planetaPeixes.setText("PLANETA REGENTE:");

        corPeixes.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        corPeixes.setText("COR:");

        numeroPeixes.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        numeroPeixes.setText("NÚMERO DA SORTE:");

        tfPeriodoPeixes.setBackground(new java.awt.Color(0, 0, 0));
        tfPeriodoPeixes.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfPeriodoPeixes.setForeground(new java.awt.Color(102, 102, 255));
        tfPeriodoPeixes.setText("19/02 a 20/03");

        tfElementosPeixes.setBackground(new java.awt.Color(0, 0, 0));
        tfElementosPeixes.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfElementosPeixes.setForeground(new java.awt.Color(102, 102, 255));
        tfElementosPeixes.setText("Água");

        tfPlanetaPeixes.setText("Netuno");

        tfCorPeixes.setText("Lilás/Verde-mar");

        tfNumeroPeixes.setText("7");

        javax.swing.GroupLayout areaInformacoes11Layout = new javax.swing.GroupLayout(areaInformacoes11);
        areaInformacoes11.setLayout(areaInformacoes11Layout);
        areaInformacoes11Layout.setHorizontalGroup(
            areaInformacoes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes11Layout.createSequentialGroup()
                .addGroup(areaInformacoes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoes11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imgSignoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(areaInformacoes11Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(areaInformacoes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(areaInformacoes11Layout.createSequentialGroup()
                                .addGroup(areaInformacoes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(areaInformacoes11Layout.createSequentialGroup()
                                        .addComponent(elementoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfElementosPeixes))
                                    .addGroup(areaInformacoes11Layout.createSequentialGroup()
                                        .addComponent(corPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCorPeixes))
                                    .addGroup(areaInformacoes11Layout.createSequentialGroup()
                                        .addComponent(planetaPeixes)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPlanetaPeixes))
                                    .addGroup(areaInformacoes11Layout.createSequentialGroup()
                                        .addComponent(numeroPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfNumeroPeixes))
                                    .addGroup(areaInformacoes11Layout.createSequentialGroup()
                                        .addComponent(periodoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPeriodoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 17, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        areaInformacoes11Layout.setVerticalGroup(
            areaInformacoes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaInformacoes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(areaInformacoes11Layout.createSequentialGroup()
                        .addGroup(areaInformacoes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(areaInformacoes11Layout.createSequentialGroup()
                                .addComponent(imgSignoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tituloPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(periodoPeixes))
                            .addComponent(tfPeriodoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(areaInformacoes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(elementoPeixes)
                            .addComponent(tfElementosPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(planetaPeixes))
                    .addComponent(tfPlanetaPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(corPeixes)
                    .addComponent(tfCorPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numeroPeixes, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfNumeroPeixes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        fundoPeixes.add(areaInformacoes11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, 690));

        tituloCaracterísticas11.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        tituloCaracterísticas11.setText("Características");

        pfortesPeixes.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        pfortesPeixes.setText("Pontos Fortes:");

        pMelhoriasPeixes.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        pMelhoriasPeixes.setText("Pontos a Melhorar:");

        txFortesPeixes.setColumns(20);
        txFortesPeixes.setRows(5);
        txFortesPeixes.setText("Peixes costuma ser associado à empatia, sensibilidade e imaginação. É um signo que pode perceber facilmente o clima emocional de um ambiente e se preocupar bastante com as pessoas próximas. A criatividade também pode ser uma característica muito forte, especialmente em áreas artísticas.");
        jScrollPane24.setViewportView(txFortesPeixes);

        txMelhorarPeixes.setColumns(20);
        txMelhorarPeixes.setRows(5);
        txMelhorarPeixes.setText("Por ser muito sensível, Peixes pode absorver facilmente os problemas e emoções de outras pessoas. Isso pode acabar deixando a pessoa emocionalmente cansada. Também pode idealizar pessoas ou situações e criar expectativas que não correspondem à realidade.");
        jScrollPane25.setViewportView(txMelhorarPeixes);

        javax.swing.GroupLayout areaCaracteristicas11Layout = new javax.swing.GroupLayout(areaCaracteristicas11);
        areaCaracteristicas11.setLayout(areaCaracteristicas11Layout);
        areaCaracteristicas11Layout.setHorizontalGroup(
            areaCaracteristicas11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas11Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(areaCaracteristicas11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tituloCaracterísticas11, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pfortesPeixes)
                    .addComponent(pMelhoriasPeixes)
                    .addComponent(jScrollPane24, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(jScrollPane25))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        areaCaracteristicas11Layout.setVerticalGroup(
            areaCaracteristicas11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas11Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tituloCaracterísticas11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pfortesPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhoriasPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        fundoPeixes.add(areaCaracteristicas11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 300, 320));

        tituloEnergiaPeixes.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        tituloEnergiaPeixes.setText("Energia do Dia:");

        amorPeixes.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        amorPeixes.setText("Amor:");

        tfAmorPeixes.setText("97%");

        trabalhoPeixes.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        trabalhoPeixes.setText("Trabalho:");

        tfTrabalhoPeixes.setText("80%");

        saudePeixes.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        saudePeixes.setText("Saúde:");

        tfSaudePeixes.setText("78%");

        sortePeixes.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        sortePeixes.setText("Sorte:");

        tfSortePeixes.setText("85%");

        javax.swing.GroupLayout areaEnergia11Layout = new javax.swing.GroupLayout(areaEnergia11);
        areaEnergia11.setLayout(areaEnergia11Layout);
        areaEnergia11Layout.setHorizontalGroup(
            areaEnergia11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia11Layout.createSequentialGroup()
                .addGroup(areaEnergia11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergia11Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(tituloEnergiaPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaEnergia11Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(areaEnergia11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfTrabalhoPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(trabalhoPeixes)
                            .addComponent(tfAmorPeixes)
                            .addComponent(amorPeixes)
                            .addComponent(saudePeixes)
                            .addComponent(tfSaudePeixes)
                            .addComponent(sortePeixes)
                            .addComponent(tfSortePeixes))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        areaEnergia11Layout.setVerticalGroup(
            areaEnergia11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amorPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trabalhoPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudePeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudePeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sortePeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSortePeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        fundoPeixes.add(areaEnergia11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 50, 320, 300));

        tituloMensagemPeixes.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        tituloMensagemPeixes.setText("Mensagem do dia");

        btnCopiarMsgPeixes.setBackground(new java.awt.Color(51, 51, 51));
        btnCopiarMsgPeixes.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        btnCopiarMsgPeixes.setForeground(new java.awt.Color(102, 102, 255));
        btnCopiarMsgPeixes.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagem11Layout = new javax.swing.GroupLayout(areaMensagem11);
        areaMensagem11.setLayout(areaMensagem11Layout);
        areaMensagem11Layout.setHorizontalGroup(
            areaMensagem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaMensagem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagem11Layout.createSequentialGroup()
                        .addComponent(tituloMensagemPeixes)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txMensagemPeixes))
                .addContainerGap())
            .addGroup(areaMensagem11Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnCopiarMsgPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        areaMensagem11Layout.setVerticalGroup(
            areaMensagem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txMensagemPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCopiarMsgPeixes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fundoPeixes.add(areaMensagem11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 410, 320, 230));

        fundopeixes.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        fundopeixes.setForeground(new java.awt.Color(102, 102, 255));
        fundopeixes.setIcon(new javax.swing.ImageIcon("C:\\Users\\KawanDantas\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Peixes.jpg")); // NOI18N
        fundoPeixes.add(fundopeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        areasAbas.addTab("Peixes", fundoPeixes);

        fundovirgem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgSignoVirgem.setIcon(new javax.swing.ImageIcon("C:\\Users\\KawanDantas\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Virgem.jpg")); // NOI18N

        tituloVirgem.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        tituloVirgem.setText("VIRGEM");

        periodoVirgem.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        periodoVirgem.setText("PERIODO:");

        elementovirgem.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        elementovirgem.setText("ELEMENTO:");

        planetaVirgem.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        planetaVirgem.setText("PLANETA REGENTE:");

        corVirgem.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        corVirgem.setText("COR:");

        numeroVirgem.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        numeroVirgem.setText("NÚMERO DA SORTE:");

        tfPeriodoVirgem.setText("23/08 a 22/09\n ");

        tfElementosVirgem.setText("Terra");

        tfPlanetaVirgem.setText("Mercúrio");

        tfCorVirgem.setText("Verde/Marrom");

        tfNumeroVirgem.setText("5");

        javax.swing.GroupLayout areaInformacoes12Layout = new javax.swing.GroupLayout(areaInformacoes12);
        areaInformacoes12.setLayout(areaInformacoes12Layout);
        areaInformacoes12Layout.setHorizontalGroup(
            areaInformacoes12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes12Layout.createSequentialGroup()
                .addGroup(areaInformacoes12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoes12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imgSignoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(areaInformacoes12Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(areaInformacoes12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(areaInformacoes12Layout.createSequentialGroup()
                                .addGroup(areaInformacoes12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(areaInformacoes12Layout.createSequentialGroup()
                                        .addComponent(elementovirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfElementosVirgem))
                                    .addGroup(areaInformacoes12Layout.createSequentialGroup()
                                        .addComponent(corVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCorVirgem))
                                    .addGroup(areaInformacoes12Layout.createSequentialGroup()
                                        .addComponent(planetaVirgem)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPlanetaVirgem))
                                    .addGroup(areaInformacoes12Layout.createSequentialGroup()
                                        .addComponent(numeroVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfNumeroVirgem))
                                    .addGroup(areaInformacoes12Layout.createSequentialGroup()
                                        .addComponent(periodoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPeriodoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 17, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        areaInformacoes12Layout.setVerticalGroup(
            areaInformacoes12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaInformacoes12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(areaInformacoes12Layout.createSequentialGroup()
                        .addGroup(areaInformacoes12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(areaInformacoes12Layout.createSequentialGroup()
                                .addComponent(imgSignoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tituloVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(periodoVirgem))
                            .addComponent(tfPeriodoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(areaInformacoes12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(elementovirgem)
                            .addComponent(tfElementosVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(planetaVirgem))
                    .addComponent(tfPlanetaVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(corVirgem)
                    .addComponent(tfCorVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numeroVirgem, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfNumeroVirgem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        fundovirgem.add(areaInformacoes12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, 690));

        tituloCaracterísticas12.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        tituloCaracterísticas12.setText("Características");

        pfortesVirgem.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        pfortesVirgem.setText("Pontos Fortes:");

        pMelhoriasVirgem.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        pMelhoriasVirgem.setText("Pontos a Melhorar:");

        txFortesVirgem.setColumns(20);
        txFortesVirgem.setRows(5);
        txFortesVirgem.setText("Virgem costuma ser associado à organização, responsabilidade e atenção aos detalhes. É um signo que tende a perceber coisas que outras pessoas deixam passar. Pode ser muito dedicado aos estudos, trabalho ou projetos pessoais quando realmente se interessa por algo.");
        jScrollPane26.setViewportView(txFortesVirgem);

        txMelhorarVirgem.setColumns(20);
        txMelhorarVirgem.setRows(5);
        txMelhorarVirgem.setText("O perfeccionismo pode ser um dos maiores desafios. Virgem pode exigir muito de si mesmo e ficar frustrado quando algo não sai exatamente como imaginava. Essa cobrança também pode acabar sendo direcionada às outras pessoas. Em alguns momentos, pode analisar tanto uma situação que acaba ficando preocupado demais.");
        jScrollPane27.setViewportView(txMelhorarVirgem);

        javax.swing.GroupLayout areaCaracteristicas12Layout = new javax.swing.GroupLayout(areaCaracteristicas12);
        areaCaracteristicas12.setLayout(areaCaracteristicas12Layout);
        areaCaracteristicas12Layout.setHorizontalGroup(
            areaCaracteristicas12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas12Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(areaCaracteristicas12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tituloCaracterísticas12, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pfortesVirgem)
                    .addComponent(pMelhoriasVirgem)
                    .addComponent(jScrollPane26, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(jScrollPane27))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        areaCaracteristicas12Layout.setVerticalGroup(
            areaCaracteristicas12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas12Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tituloCaracterísticas12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pfortesVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhoriasVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        fundovirgem.add(areaCaracteristicas12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 300, 320));

        areaPrevisao12.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        areaPrevisao12.setText("Previsão do Dia:");

        btnAtualizarPrevisaoVirgem.setBackground(new java.awt.Color(51, 51, 51));
        btnAtualizarPrevisaoVirgem.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        btnAtualizarPrevisaoVirgem.setForeground(new java.awt.Color(0, 153, 0));
        btnAtualizarPrevisaoVirgem.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisoes12Layout = new javax.swing.GroupLayout(areaPrevisoes12);
        areaPrevisoes12.setLayout(areaPrevisoes12Layout);
        areaPrevisoes12Layout.setHorizontalGroup(
            areaPrevisoes12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoes12Layout.createSequentialGroup()
                .addGroup(areaPrevisoes12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoes12Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(areaPrevisoes12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(areaPrevisao12, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txPrevisaoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaPrevisoes12Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnAtualizarPrevisaoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        areaPrevisoes12Layout.setVerticalGroup(
            areaPrevisoes12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoes12Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(areaPrevisao12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtualizarPrevisaoVirgem)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        fundovirgem.add(areaPrevisoes12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 300, 250));

        tituloEnergiaVirgem.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        tituloEnergiaVirgem.setText("Energia do Dia:");

        amorVirgem.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        amorVirgem.setText("Amor:");

        tfAmorVirgem.setText("82%");

        trabalhoVirgem.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        trabalhoVirgem.setText("Trabalho:");

        tfTrabalhoVirgem.setText("96%");

        saudeVirgem.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        saudeVirgem.setText("Saúde:");

        tfSaudeVirgem.setText("90%");

        sorteVirgem.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        sorteVirgem.setText("Sorte:");

        tfSorteVirgem.setText("78%");

        javax.swing.GroupLayout areaEnergia12Layout = new javax.swing.GroupLayout(areaEnergia12);
        areaEnergia12.setLayout(areaEnergia12Layout);
        areaEnergia12Layout.setHorizontalGroup(
            areaEnergia12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia12Layout.createSequentialGroup()
                .addGroup(areaEnergia12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergia12Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(tituloEnergiaVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaEnergia12Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(areaEnergia12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfTrabalhoVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(trabalhoVirgem)
                            .addComponent(tfAmorVirgem)
                            .addComponent(amorVirgem)
                            .addComponent(saudeVirgem)
                            .addComponent(tfSaudeVirgem)
                            .addComponent(sorteVirgem)
                            .addComponent(tfSorteVirgem))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        areaEnergia12Layout.setVerticalGroup(
            areaEnergia12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amorVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trabalhoVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sorteVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        fundovirgem.add(areaEnergia12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 50, 320, 300));

        tituloMensagemVirgem.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        tituloMensagemVirgem.setText("Mensagem do dia");

        btnCopiarMsgVirgem.setBackground(new java.awt.Color(51, 51, 51));
        btnCopiarMsgVirgem.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        btnCopiarMsgVirgem.setForeground(new java.awt.Color(0, 153, 0));
        btnCopiarMsgVirgem.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagem12Layout = new javax.swing.GroupLayout(areaMensagem12);
        areaMensagem12.setLayout(areaMensagem12Layout);
        areaMensagem12Layout.setHorizontalGroup(
            areaMensagem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaMensagem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagem12Layout.createSequentialGroup()
                        .addComponent(tituloMensagemVirgem)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txMensagemVirgem))
                .addContainerGap())
            .addGroup(areaMensagem12Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnCopiarMsgVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        areaMensagem12Layout.setVerticalGroup(
            areaMensagem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txMensagemVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCopiarMsgVirgem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fundovirgem.add(areaMensagem12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 410, 320, 230));

        fundoVirgem.setIcon(new javax.swing.ImageIcon("C:\\Users\\KawanDantas\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Virgem.jpg")); // NOI18N
        fundovirgem.add(fundoVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        areasAbas.addTab("Virgem", fundovirgem);

        fundoleao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoes13.setBackground(new java.awt.Color(255, 255, 255));

        imgSignoLeao.setIcon(new javax.swing.ImageIcon("C:\\Users\\KawanDantas\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Leao.jpg")); // NOI18N

        tituloLeao.setBackground(new java.awt.Color(255, 204, 0));
        tituloLeao.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        tituloLeao.setText("LEÃO");

        periodoLeao.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        periodoLeao.setText("PERIODO:");

        elementoLeao.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        elementoLeao.setText("ELEMENTO:");

        planetaLeao.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        planetaLeao.setText("PLANETA REGENTE:");

        corLeao.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        corLeao.setText("COR:");

        numeroLeao.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        numeroLeao.setText("NÚMERO DA SORTE:");

        tfPeriodoLeao.setText("23/07");

        tfElementosLeao.setText("Fogo");

        tfPlanetaLeao.setText("Sol");

        tfCorLeao.setText("Dourado/Laranja");

        tfNumeroLeao.setText("1");

        javax.swing.GroupLayout areaInformacoes13Layout = new javax.swing.GroupLayout(areaInformacoes13);
        areaInformacoes13.setLayout(areaInformacoes13Layout);
        areaInformacoes13Layout.setHorizontalGroup(
            areaInformacoes13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes13Layout.createSequentialGroup()
                .addGroup(areaInformacoes13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoes13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imgSignoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(areaInformacoes13Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(areaInformacoes13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(areaInformacoes13Layout.createSequentialGroup()
                                .addGroup(areaInformacoes13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(areaInformacoes13Layout.createSequentialGroup()
                                        .addComponent(elementoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfElementosLeao))
                                    .addGroup(areaInformacoes13Layout.createSequentialGroup()
                                        .addComponent(corLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCorLeao))
                                    .addGroup(areaInformacoes13Layout.createSequentialGroup()
                                        .addComponent(planetaLeao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPlanetaLeao))
                                    .addGroup(areaInformacoes13Layout.createSequentialGroup()
                                        .addComponent(numeroLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfNumeroLeao))
                                    .addGroup(areaInformacoes13Layout.createSequentialGroup()
                                        .addComponent(periodoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPeriodoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 17, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        areaInformacoes13Layout.setVerticalGroup(
            areaInformacoes13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaInformacoes13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(areaInformacoes13Layout.createSequentialGroup()
                        .addGroup(areaInformacoes13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(areaInformacoes13Layout.createSequentialGroup()
                                .addComponent(imgSignoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tituloLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(periodoLeao))
                            .addComponent(tfPeriodoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(areaInformacoes13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(elementoLeao)
                            .addComponent(tfElementosLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(planetaLeao))
                    .addComponent(tfPlanetaLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(corLeao)
                    .addComponent(tfCorLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numeroLeao, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfNumeroLeao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        fundoleao.add(areaInformacoes13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, 690));

        tituloCaracterísticas13.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        tituloCaracterísticas13.setText("Características");

        pfortesLeao.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        pfortesLeao.setText("Pontos Fortes:");

        pMelhoriasLeao.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        pMelhoriasLeao.setText("Pontos a Melhorar:");

        txFortesLeao.setColumns(20);
        txFortesLeao.setRows(5);
        txFortesLeao.setText("Leão costuma ser associado à confiança, carisma e liderança. É um signo que pode gostar de motivar as pessoas e ocupar posições de destaque. Quando acredita em alguma coisa, pode demonstrar muita segurança e determinação.");
        jScrollPane28.setViewportView(txFortesLeao);

        txMelhorarLeao.setColumns(20);
        txMelhorarLeao.setRows(5);
        txMelhorarLeao.setText("Um dos desafios de Leão pode ser a necessidade de reconhecimento. Gostar de ser valorizado é natural, mas isso pode se transformar em frustração quando a pessoa sente que não está recebendo atenção suficiente. O orgulho também pode dificultar pedidos de desculpas ou a aceitação de críticas.");
        jScrollPane29.setViewportView(txMelhorarLeao);

        javax.swing.GroupLayout areaCaracteristicas13Layout = new javax.swing.GroupLayout(areaCaracteristicas13);
        areaCaracteristicas13.setLayout(areaCaracteristicas13Layout);
        areaCaracteristicas13Layout.setHorizontalGroup(
            areaCaracteristicas13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas13Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(areaCaracteristicas13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tituloCaracterísticas13, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pfortesLeao)
                    .addComponent(pMelhoriasLeao)
                    .addComponent(jScrollPane28, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(jScrollPane29))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        areaCaracteristicas13Layout.setVerticalGroup(
            areaCaracteristicas13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas13Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tituloCaracterísticas13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pfortesLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pMelhoriasLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        fundoleao.add(areaCaracteristicas13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 300, 320));

        areaPrevisao13.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        areaPrevisao13.setText("Previsão do Dia:");

        btnAtualizarPrevisaoLeao.setBackground(new java.awt.Color(51, 51, 51));
        btnAtualizarPrevisaoLeao.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        btnAtualizarPrevisaoLeao.setForeground(new java.awt.Color(255, 204, 0));
        btnAtualizarPrevisaoLeao.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisoes13Layout = new javax.swing.GroupLayout(areaPrevisoes13);
        areaPrevisoes13.setLayout(areaPrevisoes13Layout);
        areaPrevisoes13Layout.setHorizontalGroup(
            areaPrevisoes13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoes13Layout.createSequentialGroup()
                .addGroup(areaPrevisoes13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoes13Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(areaPrevisoes13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(areaPrevisao13, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txPrevisaoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaPrevisoes13Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnAtualizarPrevisaoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        areaPrevisoes13Layout.setVerticalGroup(
            areaPrevisoes13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoes13Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(areaPrevisao13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtualizarPrevisaoLeao)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        fundoleao.add(areaPrevisoes13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 300, 250));

        tituloEnergiaLeao.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        tituloEnergiaLeao.setText("Energia do Dia:");

        amorLeao.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        amorLeao.setText("Amor:");

        tfAmorLeao.setText("92%");

        trabalhoLeao.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        trabalhoLeao.setText("Trabalho:");

        tfTrabalhoLeao.setText("94%");

        saudeLeao.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        saudeLeao.setText("Saúde:");

        tfSaudeLeao.setText("85%");

        sorteLeao.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        sorteLeao.setText("Sorte:");

        tfSorteLeao.setText("93%");

        javax.swing.GroupLayout areaEnergia13Layout = new javax.swing.GroupLayout(areaEnergia13);
        areaEnergia13.setLayout(areaEnergia13Layout);
        areaEnergia13Layout.setHorizontalGroup(
            areaEnergia13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia13Layout.createSequentialGroup()
                .addGroup(areaEnergia13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergia13Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(tituloEnergiaLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaEnergia13Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(areaEnergia13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfTrabalhoLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(trabalhoLeao)
                            .addComponent(tfAmorLeao)
                            .addComponent(amorLeao)
                            .addComponent(saudeLeao)
                            .addComponent(tfSaudeLeao)
                            .addComponent(sorteLeao)
                            .addComponent(tfSorteLeao))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        areaEnergia13Layout.setVerticalGroup(
            areaEnergia13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amorLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trabalhoLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sorteLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        fundoleao.add(areaEnergia13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 50, 320, 300));

        tituloMensagemLeao.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        tituloMensagemLeao.setText("Mensagem do dia");

        btnCopiarMsgLeao.setBackground(new java.awt.Color(51, 51, 51));
        btnCopiarMsgLeao.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        btnCopiarMsgLeao.setForeground(new java.awt.Color(255, 204, 0));
        btnCopiarMsgLeao.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagem13Layout = new javax.swing.GroupLayout(areaMensagem13);
        areaMensagem13.setLayout(areaMensagem13Layout);
        areaMensagem13Layout.setHorizontalGroup(
            areaMensagem13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaMensagem13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagem13Layout.createSequentialGroup()
                        .addComponent(tituloMensagemLeao)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txMensagemLeao))
                .addContainerGap())
            .addGroup(areaMensagem13Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnCopiarMsgLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        areaMensagem13Layout.setVerticalGroup(
            areaMensagem13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txMensagemLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCopiarMsgLeao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fundoleao.add(areaMensagem13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 410, 320, 230));

        fundoLeao.setIcon(new javax.swing.ImageIcon("C:\\Users\\KawanDantas\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Leao.jpg")); // NOI18N
        fundoleao.add(fundoLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        areasAbas.addTab("Leao", fundoleao);

        getContentPane().add(areasAbas);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Signos().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Signo1;
    private javax.swing.JLabel Signo2;
    private javax.swing.JLabel amorAquario;
    private javax.swing.JLabel amorAries;
    private javax.swing.JLabel amorCancer;
    private javax.swing.JLabel amorCapricornio;
    private javax.swing.JLabel amorEscorpiao;
    private javax.swing.JLabel amorGemeos;
    private javax.swing.JLabel amorLeao;
    private javax.swing.JLabel amorLibra;
    private javax.swing.JLabel amorPeixes;
    private javax.swing.JLabel amorSagitario;
    private javax.swing.JLabel amorTouro;
    private javax.swing.JLabel amorVirgem;
    private javax.swing.JPanel areaCaracteristicas;
    private javax.swing.JPanel areaCaracteristicas1;
    private javax.swing.JPanel areaCaracteristicas10;
    private javax.swing.JPanel areaCaracteristicas11;
    private javax.swing.JPanel areaCaracteristicas12;
    private javax.swing.JPanel areaCaracteristicas13;
    private javax.swing.JPanel areaCaracteristicas2;
    private javax.swing.JPanel areaCaracteristicas3;
    private javax.swing.JPanel areaCaracteristicas6;
    private javax.swing.JPanel areaCaracteristicas7;
    private javax.swing.JPanel areaCaracteristicas8;
    private javax.swing.JPanel areaCaracteristicas9;
    private javax.swing.JPanel areaCompatibilidade;
    private javax.swing.JPanel areaDescobrirSigno;
    private javax.swing.JPanel areaEnergia;
    private javax.swing.JPanel areaEnergia1;
    private javax.swing.JPanel areaEnergia10;
    private javax.swing.JPanel areaEnergia11;
    private javax.swing.JPanel areaEnergia12;
    private javax.swing.JPanel areaEnergia13;
    private javax.swing.JPanel areaEnergia2;
    private javax.swing.JPanel areaEnergia3;
    private javax.swing.JPanel areaEnergia6;
    private javax.swing.JPanel areaEnergia7;
    private javax.swing.JPanel areaEnergia8;
    private javax.swing.JPanel areaEnergia9;
    private javax.swing.JPanel areaInformacoes;
    private javax.swing.JPanel areaInformacoes1;
    private javax.swing.JPanel areaInformacoes10;
    private javax.swing.JPanel areaInformacoes11;
    private javax.swing.JPanel areaInformacoes12;
    private javax.swing.JPanel areaInformacoes13;
    private javax.swing.JPanel areaInformacoes2;
    private javax.swing.JPanel areaInformacoes3;
    private javax.swing.JPanel areaInformacoes6;
    private javax.swing.JPanel areaInformacoes7;
    private javax.swing.JPanel areaInformacoes8;
    private javax.swing.JPanel areaInformacoes9;
    private javax.swing.JPanel areaMensagem;
    private javax.swing.JPanel areaMensagem1;
    private javax.swing.JPanel areaMensagem10;
    private javax.swing.JPanel areaMensagem11;
    private javax.swing.JPanel areaMensagem12;
    private javax.swing.JPanel areaMensagem13;
    private javax.swing.JPanel areaMensagem2;
    private javax.swing.JPanel areaMensagem3;
    private javax.swing.JPanel areaMensagem6;
    private javax.swing.JPanel areaMensagem7;
    private javax.swing.JPanel areaMensagem8;
    private javax.swing.JPanel areaMensagem9;
    private javax.swing.JLabel areaPrevisao;
    private javax.swing.JLabel areaPrevisao1;
    private javax.swing.JLabel areaPrevisao10;
    private javax.swing.JLabel areaPrevisao11;
    private javax.swing.JLabel areaPrevisao12;
    private javax.swing.JLabel areaPrevisao13;
    private javax.swing.JLabel areaPrevisao2;
    private javax.swing.JLabel areaPrevisao3;
    private javax.swing.JLabel areaPrevisao6;
    private javax.swing.JLabel areaPrevisao7;
    private javax.swing.JLabel areaPrevisao8;
    private javax.swing.JLabel areaPrevisao9;
    private javax.swing.JPanel areaPrevisoes;
    private javax.swing.JPanel areaPrevisoes1;
    private javax.swing.JPanel areaPrevisoes10;
    private javax.swing.JPanel areaPrevisoes11;
    private javax.swing.JPanel areaPrevisoes12;
    private javax.swing.JPanel areaPrevisoes13;
    private javax.swing.JPanel areaPrevisoes2;
    private javax.swing.JPanel areaPrevisoes3;
    private javax.swing.JPanel areaPrevisoes6;
    private javax.swing.JPanel areaPrevisoes7;
    private javax.swing.JPanel areaPrevisoes8;
    private javax.swing.JPanel areaPrevisoes9;
    private javax.swing.JPanel areaRsultado;
    private javax.swing.JTabbedPane areasAbas;
    private javax.swing.JButton btnAtualizarPrevisaoAquario;
    private javax.swing.JButton btnAtualizarPrevisaoAries;
    private javax.swing.JButton btnAtualizarPrevisaoCancer;
    private javax.swing.JButton btnAtualizarPrevisaoCapricornio;
    private javax.swing.JButton btnAtualizarPrevisaoEscorpiao;
    private javax.swing.JButton btnAtualizarPrevisaoGemeos;
    private javax.swing.JButton btnAtualizarPrevisaoLeao;
    private javax.swing.JButton btnAtualizarPrevisaoLibra;
    private javax.swing.JButton btnAtualizarPrevisaoPeixes;
    private javax.swing.JButton btnAtualizarPrevisaoSagitario;
    private javax.swing.JButton btnAtualizarPrevisaoTouro;
    private javax.swing.JButton btnAtualizarPrevisaoVirgem;
    private javax.swing.JToggleButton btnCalcular;
    private javax.swing.JButton btnCopiarMsgAquario;
    private javax.swing.JButton btnCopiarMsgAries;
    private javax.swing.JButton btnCopiarMsgCancer;
    private javax.swing.JButton btnCopiarMsgCapricornio;
    private javax.swing.JButton btnCopiarMsgEscorpiao;
    private javax.swing.JButton btnCopiarMsgGemeos;
    private javax.swing.JButton btnCopiarMsgLeao;
    private javax.swing.JButton btnCopiarMsgLibra;
    private javax.swing.JButton btnCopiarMsgPeixes;
    private javax.swing.JButton btnCopiarMsgSagitario;
    private javax.swing.JButton btnCopiarMsgTouro;
    private javax.swing.JButton btnCopiarMsgVirgem;
    private javax.swing.JButton btnDescobrirSigno;
    private javax.swing.JButton btnSigno;
    private javax.swing.JComboBox<String> cbDia;
    private javax.swing.JComboBox<String> cbMes;
    private javax.swing.JLabel corAquario;
    private javax.swing.JLabel corAries;
    private javax.swing.JLabel corCancer;
    private javax.swing.JLabel corCapricornio;
    private javax.swing.JLabel corEscorpiao;
    private javax.swing.JLabel corGemeos;
    private javax.swing.JLabel corLeao;
    private javax.swing.JLabel corLibra;
    private javax.swing.JLabel corPeixes;
    private javax.swing.JLabel corSagitario;
    private javax.swing.JLabel corTouro;
    private javax.swing.JLabel corVirgem;
    private javax.swing.JLabel elementoAquario;
    private javax.swing.JLabel elementoAries;
    private javax.swing.JLabel elementoCancer;
    private javax.swing.JLabel elementoCapricornio;
    private javax.swing.JLabel elementoEscorpiao;
    private javax.swing.JLabel elementoGemeos;
    private javax.swing.JLabel elementoLeao;
    private javax.swing.JLabel elementoLibra;
    private javax.swing.JLabel elementoPeixes;
    private javax.swing.JLabel elementoSagitario;
    private javax.swing.JLabel elementoTouro;
    private javax.swing.JLabel elementovirgem;
    private javax.swing.JPanel fundoAquario;
    private javax.swing.JLabel fundoAries;
    private javax.swing.JPanel fundoCancer;
    private javax.swing.JPanel fundoCapricornio;
    private javax.swing.JPanel fundoEscorpião;
    private javax.swing.JPanel fundoGemeos;
    private javax.swing.JLabel fundoLeao;
    private javax.swing.JPanel fundoLibra;
    private javax.swing.JPanel fundoPeixes;
    private javax.swing.JPanel fundoSagitario;
    private javax.swing.JPanel fundoTouro;
    private javax.swing.JLabel fundoVirgem;
    private javax.swing.JLabel fundoaquario;
    private javax.swing.JPanel fundoaries;
    private javax.swing.JLabel fundocancer;
    private javax.swing.JLabel fundocapricornio;
    private javax.swing.JLabel fundoescorpiao;
    private javax.swing.JLabel fundogemeos;
    private javax.swing.JLabel fundoinicio;
    private javax.swing.JPanel fundoleao;
    private javax.swing.JLabel fundolibra;
    private javax.swing.JLabel fundopeixes;
    private javax.swing.JLabel fundosagitario;
    private javax.swing.JLabel fundotouro;
    private javax.swing.JPanel fundovirgem;
    private javax.swing.JLabel imgSignoAquario;
    private javax.swing.JLabel imgSignoAries;
    private javax.swing.JLabel imgSignoCancer;
    private javax.swing.JLabel imgSignoCapricornio;
    private javax.swing.JLabel imgSignoEscorpiao;
    private javax.swing.JLabel imgSignoGemeos;
    private javax.swing.JLabel imgSignoLeao;
    private javax.swing.JLabel imgSignoLibra;
    private javax.swing.JLabel imgSignoPeixes;
    private javax.swing.JLabel imgSignoSagitario;
    private javax.swing.JLabel imgSignoTouro;
    private javax.swing.JLabel imgSignoVirgem;
    private javax.swing.JPanel inicio;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel numeroAquario;
    private javax.swing.JLabel numeroAries;
    private javax.swing.JLabel numeroCancer;
    private javax.swing.JLabel numeroCapricornio;
    private javax.swing.JLabel numeroEscorpiao;
    private javax.swing.JLabel numeroGemeos;
    private javax.swing.JLabel numeroLeao;
    private javax.swing.JLabel numeroLibra;
    private javax.swing.JLabel numeroPeixes;
    private javax.swing.JLabel numeroSagitario;
    private javax.swing.JLabel numeroTouro;
    private javax.swing.JLabel numeroVirgem;
    private javax.swing.JLabel pMelhoriasAquario;
    private javax.swing.JLabel pMelhoriasAries;
    private javax.swing.JLabel pMelhoriasCancer;
    private javax.swing.JLabel pMelhoriasCapricornio;
    private javax.swing.JLabel pMelhoriasEscorpiao;
    private javax.swing.JLabel pMelhoriasGemeos;
    private javax.swing.JLabel pMelhoriasLeao;
    private javax.swing.JLabel pMelhoriasLibra;
    private javax.swing.JLabel pMelhoriasPeixes;
    private javax.swing.JLabel pMelhoriasSagitario;
    private javax.swing.JLabel pMelhoriasTouro;
    private javax.swing.JLabel pMelhoriasVirgem;
    private javax.swing.JLabel periodoAquario;
    private javax.swing.JLabel periodoAries;
    private javax.swing.JLabel periodoCancer;
    private javax.swing.JLabel periodoCapricornio;
    private javax.swing.JLabel periodoEscorpiao;
    private javax.swing.JLabel periodoGemeos;
    private javax.swing.JLabel periodoLeao;
    private javax.swing.JLabel periodoLibra;
    private javax.swing.JLabel periodoPeixes;
    private javax.swing.JLabel periodoSagitario;
    private javax.swing.JLabel periodoTouro;
    private javax.swing.JLabel periodoVirgem;
    private javax.swing.JLabel pfortesAquario;
    private javax.swing.JLabel pfortesAries;
    private javax.swing.JLabel pfortesCancer;
    private javax.swing.JLabel pfortesCapricornio;
    private javax.swing.JLabel pfortesEscorpiao;
    private javax.swing.JLabel pfortesGemeos;
    private javax.swing.JLabel pfortesLeao;
    private javax.swing.JLabel pfortesLibra;
    private javax.swing.JLabel pfortesPeixes;
    private javax.swing.JLabel pfortesSagitario;
    private javax.swing.JLabel pfortesTouro;
    private javax.swing.JLabel pfortesVirgem;
    private javax.swing.JLabel planetaAquario;
    private javax.swing.JLabel planetaAries;
    private javax.swing.JLabel planetaCancer;
    private javax.swing.JLabel planetaCapricornio;
    private javax.swing.JLabel planetaEscorpiao;
    private javax.swing.JLabel planetaGemeos;
    private javax.swing.JLabel planetaLeao;
    private javax.swing.JLabel planetaLibra;
    private javax.swing.JLabel planetaPeixes;
    private javax.swing.JLabel planetaSagitario;
    private javax.swing.JLabel planetaTouro;
    private javax.swing.JLabel planetaVirgem;
    private javax.swing.JLabel saudeAquario;
    private javax.swing.JLabel saudeAries;
    private javax.swing.JLabel saudeCancer;
    private javax.swing.JLabel saudeCapricornio;
    private javax.swing.JLabel saudeEscorpiao;
    private javax.swing.JLabel saudeGemeos;
    private javax.swing.JLabel saudeLeao;
    private javax.swing.JLabel saudeLibra;
    private javax.swing.JLabel saudePeixes;
    private javax.swing.JLabel saudeSagitario;
    private javax.swing.JLabel saudeTouro;
    private javax.swing.JLabel saudeVirgem;
    private javax.swing.JLabel sorteAquario;
    private javax.swing.JLabel sorteAries;
    private javax.swing.JLabel sorteCancer;
    private javax.swing.JLabel sorteCapricornio;
    private javax.swing.JLabel sorteEscorpiao;
    private javax.swing.JLabel sorteGemeos;
    private javax.swing.JLabel sorteLeao;
    private javax.swing.JLabel sorteLibra;
    private javax.swing.JLabel sortePeixes;
    private javax.swing.JLabel sorteSagitario;
    private javax.swing.JLabel sorteTouro;
    private javax.swing.JLabel sorteVirgem;
    private javax.swing.JTextField tfAmorAquario;
    private javax.swing.JTextField tfAmorAries;
    private javax.swing.JTextField tfAmorCancer;
    private javax.swing.JTextField tfAmorCapricornio;
    private javax.swing.JTextField tfAmorEscorpiao;
    private javax.swing.JTextField tfAmorGemeos;
    private javax.swing.JTextField tfAmorLeao;
    private javax.swing.JTextField tfAmorLibra;
    private javax.swing.JTextField tfAmorPeixes;
    private javax.swing.JTextField tfAmorSagitario;
    private javax.swing.JTextField tfAmorTouro;
    private javax.swing.JTextField tfAmorVirgem;
    private javax.swing.JPanel tfCompatibilidade;
    private javax.swing.JTextField tfCorAquario;
    private javax.swing.JTextField tfCorAries;
    private javax.swing.JTextField tfCorCancer;
    private javax.swing.JTextField tfCorCapricornio;
    private javax.swing.JTextField tfCorEscorpiao;
    private javax.swing.JTextField tfCorGemeos;
    private javax.swing.JTextField tfCorLeao;
    private javax.swing.JTextField tfCorLibra;
    private javax.swing.JTextField tfCorPeixes;
    private javax.swing.JTextField tfCorSagitario;
    private javax.swing.JTextField tfCorTouro;
    private javax.swing.JTextField tfCorVirgem;
    private javax.swing.JTextField tfElementosAquario;
    private javax.swing.JTextField tfElementosAries;
    private javax.swing.JTextField tfElementosCancer;
    private javax.swing.JTextField tfElementosCapricornio;
    private javax.swing.JTextField tfElementosEscorpiao;
    private javax.swing.JTextField tfElementosGemeos;
    private javax.swing.JTextField tfElementosLeao;
    private javax.swing.JTextField tfElementosLibra;
    private javax.swing.JTextField tfElementosPeixes;
    private javax.swing.JTextField tfElementosSagitario;
    private javax.swing.JTextField tfElementosTouro;
    private javax.swing.JTextField tfElementosVirgem;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumeroAquario;
    private javax.swing.JTextField tfNumeroAries;
    private javax.swing.JTextField tfNumeroCancer;
    private javax.swing.JTextField tfNumeroCapricornio;
    private javax.swing.JTextField tfNumeroEscorpiao;
    private javax.swing.JTextField tfNumeroGemeos;
    private javax.swing.JTextField tfNumeroLeao;
    private javax.swing.JTextField tfNumeroLibra;
    private javax.swing.JTextField tfNumeroPeixes;
    private javax.swing.JTextField tfNumeroSagitario;
    private javax.swing.JTextField tfNumeroTouro;
    private javax.swing.JTextField tfNumeroVirgem;
    private javax.swing.JTextField tfPeriodoAquario;
    private javax.swing.JTextField tfPeriodoAries;
    private javax.swing.JTextField tfPeriodoCancer;
    private javax.swing.JTextField tfPeriodoCapricornio;
    private javax.swing.JTextField tfPeriodoEscorpiao;
    private javax.swing.JTextField tfPeriodoGemeos;
    private javax.swing.JTextField tfPeriodoLeao;
    private javax.swing.JTextField tfPeriodoLibra;
    private javax.swing.JTextField tfPeriodoPeixes;
    private javax.swing.JTextField tfPeriodoSagitario;
    private javax.swing.JTextField tfPeriodoTouro;
    private javax.swing.JTextField tfPeriodoVirgem;
    private javax.swing.JTextField tfPlanetaAquario;
    private javax.swing.JTextField tfPlanetaAries;
    private javax.swing.JTextField tfPlanetaCancer;
    private javax.swing.JTextField tfPlanetaCapricornio;
    private javax.swing.JTextField tfPlanetaEscorpiao;
    private javax.swing.JTextField tfPlanetaGemeos;
    private javax.swing.JTextField tfPlanetaLeao;
    private javax.swing.JTextField tfPlanetaLibra;
    private javax.swing.JTextField tfPlanetaPeixes;
    private javax.swing.JTextField tfPlanetaSagitario;
    private javax.swing.JTextField tfPlanetaTouro;
    private javax.swing.JTextField tfPlanetaVirgem;
    private javax.swing.JTextField tfSaudeAquario;
    private javax.swing.JTextField tfSaudeAries;
    private javax.swing.JTextField tfSaudeCancer;
    private javax.swing.JTextField tfSaudeCapricornio;
    private javax.swing.JTextField tfSaudeEsorpiao;
    private javax.swing.JTextField tfSaudeGemeos;
    private javax.swing.JTextField tfSaudeLeao;
    private javax.swing.JTextField tfSaudeLibra;
    private javax.swing.JTextField tfSaudePeixes;
    private javax.swing.JTextField tfSaudeSagitario;
    private javax.swing.JTextField tfSaudeTouro;
    private javax.swing.JTextField tfSaudeVirgem;
    private javax.swing.JTextField tfSorteAquario;
    private javax.swing.JTextField tfSorteAries;
    private javax.swing.JTextField tfSorteCancer;
    private javax.swing.JTextField tfSorteCapricornio;
    private javax.swing.JTextField tfSorteEscorpiao;
    private javax.swing.JTextField tfSorteGemeos;
    private javax.swing.JTextField tfSorteLeao;
    private javax.swing.JTextField tfSorteLibra;
    private javax.swing.JTextField tfSortePeixes;
    private javax.swing.JTextField tfSorteSagitario;
    private javax.swing.JTextField tfSorteTouro;
    private javax.swing.JTextField tfSorteVirgem;
    private javax.swing.JTextField tfTrabalhoAquario;
    private javax.swing.JTextField tfTrabalhoAries;
    private javax.swing.JTextField tfTrabalhoCancer;
    private javax.swing.JTextField tfTrabalhoCapricornio;
    private javax.swing.JTextField tfTrabalhoEscorpiao;
    private javax.swing.JTextField tfTrabalhoGemeos;
    private javax.swing.JTextField tfTrabalhoLeao;
    private javax.swing.JTextField tfTrabalhoLibra;
    private javax.swing.JTextField tfTrabalhoPeixes;
    private javax.swing.JTextField tfTrabalhoSagitario;
    private javax.swing.JTextField tfTrabalhoTouro;
    private javax.swing.JTextField tfTrabalhoVirgem;
    private javax.swing.JLabel tituloAquario;
    private javax.swing.JLabel tituloAries;
    private javax.swing.JLabel tituloCancer;
    private javax.swing.JLabel tituloCapricornio;
    private javax.swing.JLabel tituloCaracterísticas;
    private javax.swing.JLabel tituloCaracterísticas1;
    private javax.swing.JLabel tituloCaracterísticas10;
    private javax.swing.JLabel tituloCaracterísticas11;
    private javax.swing.JLabel tituloCaracterísticas12;
    private javax.swing.JLabel tituloCaracterísticas13;
    private javax.swing.JLabel tituloCaracterísticas2;
    private javax.swing.JLabel tituloCaracterísticas3;
    private javax.swing.JLabel tituloCaracterísticas6;
    private javax.swing.JLabel tituloCaracterísticas7;
    private javax.swing.JLabel tituloCaracterísticas8;
    private javax.swing.JLabel tituloCaracterísticas9;
    private javax.swing.JLabel tituloCompatibilidade;
    private javax.swing.JLabel tituloEnergiaAquario;
    private javax.swing.JLabel tituloEnergiaAries;
    private javax.swing.JLabel tituloEnergiaCancer;
    private javax.swing.JLabel tituloEnergiaCapricornio;
    private javax.swing.JLabel tituloEnergiaEscorpiao;
    private javax.swing.JLabel tituloEnergiaGemeos;
    private javax.swing.JLabel tituloEnergiaLeao;
    private javax.swing.JLabel tituloEnergiaLibra;
    private javax.swing.JLabel tituloEnergiaPeixes;
    private javax.swing.JLabel tituloEnergiaSagitario;
    private javax.swing.JLabel tituloEnergiaTouro;
    private javax.swing.JLabel tituloEnergiaVirgem;
    private javax.swing.JLabel tituloEscorpiao;
    private javax.swing.JLabel tituloGemeos;
    private javax.swing.JLabel tituloLeao;
    private javax.swing.JLabel tituloLibra;
    private javax.swing.JLabel tituloMensagemAquario;
    private javax.swing.JLabel tituloMensagemAries;
    private javax.swing.JLabel tituloMensagemCancer;
    private javax.swing.JLabel tituloMensagemCapricornio;
    private javax.swing.JLabel tituloMensagemEscorpiao;
    private javax.swing.JLabel tituloMensagemGemeos;
    private javax.swing.JLabel tituloMensagemLeao;
    private javax.swing.JLabel tituloMensagemLibra;
    private javax.swing.JLabel tituloMensagemPeixes;
    private javax.swing.JLabel tituloMensagemSagitario;
    private javax.swing.JLabel tituloMensagemTouro;
    private javax.swing.JLabel tituloMensagemVirgem;
    private javax.swing.JLabel tituloPeixes;
    private javax.swing.JLabel tituloSagitario;
    private javax.swing.JLabel tituloTouro;
    private javax.swing.JLabel tituloVirgem;
    private javax.swing.JLabel trabalhoAquario;
    private javax.swing.JLabel trabalhoAries;
    private javax.swing.JLabel trabalhoCancer;
    private javax.swing.JLabel trabalhoCapricornio;
    private javax.swing.JLabel trabalhoEscorpiao;
    private javax.swing.JLabel trabalhoGemeos;
    private javax.swing.JLabel trabalhoLeao;
    private javax.swing.JLabel trabalhoLibra;
    private javax.swing.JLabel trabalhoPeixes;
    private javax.swing.JLabel trabalhoSagitario;
    private javax.swing.JLabel trabalhoTouro;
    private javax.swing.JLabel trabalhoVirgem;
    private javax.swing.JTextArea txFortesAquario;
    private javax.swing.JTextArea txFortesAries;
    private javax.swing.JTextArea txFortesCancer;
    private javax.swing.JTextArea txFortesCapricornio;
    private javax.swing.JTextArea txFortesEscorpiao;
    private javax.swing.JTextArea txFortesGemeos;
    private javax.swing.JTextArea txFortesLeao;
    private javax.swing.JTextArea txFortesLibra;
    private javax.swing.JTextArea txFortesPeixes;
    private javax.swing.JTextArea txFortesSagitario;
    private javax.swing.JTextArea txFortesTouro;
    private javax.swing.JTextArea txFortesVirgem;
    private javax.swing.JTextArea txMelhorarAquario;
    private javax.swing.JTextArea txMelhorarAries;
    private javax.swing.JTextArea txMelhorarCancer;
    private javax.swing.JTextArea txMelhorarCapricornio;
    private javax.swing.JTextArea txMelhorarEscorpiao;
    private javax.swing.JTextArea txMelhorarGemeos;
    private javax.swing.JTextArea txMelhorarLeao;
    private javax.swing.JTextArea txMelhorarLibra;
    private javax.swing.JTextArea txMelhorarPeixes;
    private javax.swing.JTextArea txMelhorarSagitario;
    private javax.swing.JTextArea txMelhorarTouro;
    private javax.swing.JTextArea txMelhorarVirgem;
    private javax.swing.JScrollPane txMensagemAquario;
    private javax.swing.JScrollPane txMensagemCancer;
    private javax.swing.JScrollPane txMensagemCapricornio;
    private javax.swing.JScrollPane txMensagemEscorpiao;
    private javax.swing.JScrollPane txMensagemGemeos;
    private javax.swing.JScrollPane txMensagemLeao;
    private javax.swing.JScrollPane txMensagemLibra;
    private javax.swing.JScrollPane txMensagemPeixes;
    private javax.swing.JScrollPane txMensagemSagitario;
    private javax.swing.JScrollPane txMensagemVirgem;
    private javax.swing.JScrollPane txPrevisaoAquario;
    private javax.swing.JScrollPane txPrevisaoAries;
    private javax.swing.JScrollPane txPrevisaoCancer;
    private javax.swing.JScrollPane txPrevisaoCapricornio;
    private javax.swing.JScrollPane txPrevisaoEscorpiao;
    private javax.swing.JScrollPane txPrevisaoGemeos;
    private javax.swing.JScrollPane txPrevisaoLeao;
    private javax.swing.JScrollPane txPrevisaoLibra;
    private javax.swing.JScrollPane txPrevisaoPeixes;
    private javax.swing.JScrollPane txPrevisaoSagitario;
    private javax.swing.JScrollPane txPrevisaoVirgem;
    private javax.swing.JTextArea txtMensagemAries;
    private javax.swing.JTextArea txtMensagemTouro;
    private javax.swing.JScrollPane txtPrevis;
    private javax.swing.JTextArea txtPrevisaoAries;
    private javax.swing.JTextArea txtPrevisaoTouro;
    // End of variables declaration//GEN-END:variables
}
