package transaction;

@FunctionalInterface
public interface TransactionCheck<U,T> {
	public U check (T var);
	
}