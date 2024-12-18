public class Cost {
    private int cost=0;

    public int getCost() {
        return cost;
    }

    public void addCost(int amount) {
        cost += amount;
    }

    public boolean spendCost(int amount) {
        if (cost >= amount) {
            cost -= amount;
            return true;
        } else {
            return false;
        }
    }
}

