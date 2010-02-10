package com.calclab.hablar.core.client.container;

import com.calclab.hablar.core.client.page.Page;
import com.google.gwt.event.shared.GwtEvent;

public class PageAddedEvent extends GwtEvent<PageAddedHandler> {
    public static final Type<PageAddedHandler> TYPE = new Type<PageAddedHandler>();
    private final Page<?> page;
    private final PagesContainer container;

    public PageAddedEvent(Page<?> page, PagesContainer container) {
	this.page = page;
	this.container = container;
    }

    @Override
    public Type<PageAddedHandler> getAssociatedType() {
	return TYPE;
    }

    public PagesContainer getContainer() {
	return container;
    }

    public Page<?> getPage() {
	return page;
    }

    @Override
    protected void dispatch(PageAddedHandler handler) {
	handler.onPageAdded(this);
    }

}