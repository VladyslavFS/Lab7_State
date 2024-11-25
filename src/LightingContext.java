class LightingContext {
    private LightState currentState;

    public LightingContext() {
        this.currentState = new OffState(); // Початковий стан
    }

    public void setState(LightState state) {
        this.currentState = state;
    }

    public void pressButton() {
        currentState.pressButton(this);
    }
}
