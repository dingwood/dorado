/*
 * Copyright 2014-2018 f2time.com All right reserved.
 */
package mobi.f2time.dorado.example.model;

import javax.annotation.Generated;

/**
 * @author wangweiping
 *
 */
public class Campaign {
	private int id;
	private String name;

	@Generated("SparkTools")
	private Campaign(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
	}
	
	public Campaign() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Creates builder to build {@link Campaign}.
	 * @return created builder
	 */
	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}
	/**
	 * Builder to build {@link Campaign}.
	 */
	@Generated("SparkTools")
	public static final class Builder {
		private int id;
		private String name;

		private Builder() {
		}

		public Builder withId(int id) {
			this.id = id;
			return this;
		}

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Campaign build() {
			return new Campaign(this);
		}
	}
	
	
}
