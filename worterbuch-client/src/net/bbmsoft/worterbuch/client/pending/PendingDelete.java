package net.bbmsoft.worterbuch.client.pending;

import java.util.Optional;
import java.util.function.Consumer;

public class PendingDelete<T> {

	public final Consumer<Optional<T>> callback;

	public final Class<T> type;

	public PendingDelete(final Consumer<Optional<T>> callback, final Class<T> type) {
		super();
		this.callback = callback;
		this.type = type;
	}
}
