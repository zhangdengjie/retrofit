package retrofit2.adapter.rxjava2;

import retrofit2.Call;

public class Rxjava2AdapterThrowable extends Throwable {
    private Call call;

    public Rxjava2AdapterThrowable(Call call, Throwable root) {
        super(root);
        this.call = call;
    }

    public Call getCall() {
        return call;
    }

    public void setCall(Call call) {
        this.call = call;
    }
}
