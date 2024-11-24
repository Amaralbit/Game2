public class Conta{
    public int numconta;
    protected String tipo;
    private String nomedono;
    private float saldo;
    private boolean status;
    //public Conta(int n,String t,String no,float s,boolean st){
        //this.numconta=n;
        //this.tipo=t;
        //this.nomedono=no;
       // this.saldo=0;
        //this.status=false;
    //}
    public void estadoatual(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Conta: "+this.getNumconta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: "+this.getNomedono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.getStatus());
    }
    public void abrirconta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t=="CC"){
            this.setSaldo(50);
        }else{
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");

    }
    public void fecharconta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechado pois há dinheiro nela!!Saque este dinheiro e feche a conta!");
        }else if (this.getSaldo() < 0){
            System.out.println("A conta não pode ser fechada pois o saldo dela está negativo, ou seja, está com dívidas, acerte estas dividas e depois feche a conta");
        }else{
            this.setStatus(false);
            System.out.println("Suaa conta foi fechada com sucesso!");
        }

    }
    public void depositar(float v){
        if (this.getStatus()==true){
            this.setSaldo(this.getSaldo()+v);
            System.out.println("Deposito realizado na conta de :"+this.getNomedono());

        }else{
            System.out.println("Essa conta está fechada, logo não dá para depositar nela");
        }

    }
    public void sacar(float v){
        if (this.getStatus()==true){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Saque realizado na conde de "+this.getNomedono());
            }else{
                System.out.println("Saldo insuficiente para saque!");
            }
        }else{
            System.out.println("Não dá para sacar pois a conta está desativada ou inestente");
        }

    }
    public void pagarmensalidade(){
        int v =0;
        if (this.getTipo()=="CC") {
            v = 12;
        }else if(this.getTipo()=="CP"){
            v = 20;
        }
        if(this.getStatus()==true){
            this.setSaldo(this.getSaldo()-v);
            System.out.println("Mensalidade paga com sucesso para a conta do(a) "+this.getNomedono());
        }else{
            System.out.println("Está conta não está aberta!");
        }

    }

    public int getNumconta(){
        return this.numconta;
    }
    public void setNumconta(int n){
        this.numconta=n;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String t){
        this.tipo=t;
    }
    public String getNomedono(){
        return this.nomedono;
    }
    public void setNomedono(String no){
        this.nomedono=no;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float s){
        this.saldo=s;
    }
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean st){
        this.status=st;
    }

}
