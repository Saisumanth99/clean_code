package SingleUseCase;

class Player {
    AttackInterface attackType;
    void setAttackType(AttackInterface attackType){
        this.attackType = attackType;
    }
    void attack(){
        attackType.midRangeAttack();
        attackType.killEnemy();
    }
}
