package fr.uvsq.pglp;

public class RobotMobile extends Robot{
    public RobotMobile(int position) {
        super(position);
        // TODO Auto-generated constructor stub
    }

    public void avancerTous() {
        super.position+=10;
    }
}
