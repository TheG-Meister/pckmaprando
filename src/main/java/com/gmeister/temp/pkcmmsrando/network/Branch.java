package com.gmeister.temp.pkcmmsrando.network;

public class Branch<N>
{
	
	private final N source;
	private final N target;
	
	public Branch(N source, N target)
	{
		super();
		this.source = source;
		this.target = target;
	}
	
	public N getSource()
	{ return this.source; }
	
	public N getTarget()
	{ return this.target; }

	@Override
	public String toString()
	{ return "Branch [source=" + this.source + ", target=" + this.target + "]"; }

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.source == null) ? 0 : this.source.hashCode());
		result = prime * result + ((this.target == null) ? 0 : this.target.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Branch<?> other = (Branch<?>) obj;
		if (this.source == null)
		{
			if (other.source != null) return false;
		}
		else if (!this.source.equals(other.source)) return false;
		if (this.target == null)
		{
			if (other.target != null) return false;
		}
		else if (!this.target.equals(other.target)) return false;
		return true;
	}
	
}
