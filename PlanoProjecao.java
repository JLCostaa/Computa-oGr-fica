class PlanoProjecao {
    double xmin, xmax, ymin, ymax;

    public PlanoProjecao(double xmin, double xmax, double ymin, double ymax) {
        this.xmin = xmin;
        this.xmax = xmax;
        this.ymin = ymin;
        this.ymax = ymax;
    }

    public double getXmin() {
        return this.xmin;
    }

    public void setXmin(double xmin) {
        this.xmin = xmin;
    }

    public double getXmax() {
        return this.xmax;
    }

    public void setXmax(double xmax) {
        this.xmax = xmax;
    }

    public double getYmin() {
        return this.ymin;
    }

    public void setYmin(double ymin) {
        this.ymin = ymin;
    }

    public double getYmax() {
        return this.ymax;
    }

    public void setYmax(double ymax) {
        this.ymax = ymax;
    }

    public int calcularCodigo(Ponto ponto) {
        int codigo = 0;
        if (ponto.x < xmin) {
            codigo |= 1;
        }
        if (ponto.x > xmax) {
            codigo |= 2;
        }
        if (ponto.y < ymin) {
            codigo |= 4;
        }
        if (ponto.y > ymax) {
            codigo |= 8;
        }
        return codigo;
    }
}
