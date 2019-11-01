
public class Athlete {
	private int headache;
	private int pressure;
	private int neck;
	private int vomit;
	private int dizzy;
	private int blur;
	private int balance;
	private int light;
	private int noise;
	private int slow;
	private int fog;
	private int right;
	private int concentrate;
	private int remember;
	private int fatigue;
	private int confusion;
	private int drowsy;
	private int sleep;
	private int emotion;
	private int irritable;
	private int sad;
	private int nervous;
	
	public Athlete(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k, int l, int m, int n, int o, int p, int q, int r, int s, int t, int u, int v)
	{
		headache = a;
		pressure = b;
		neck = c;
		vomit = d;
		dizzy = e;
		blur = f;
		balance = g;
		light = h;
		noise = i;
		slow = j;
		fog = k;
		right = l;
		concentrate = m;
		remember = n;
		fatigue = o;
		confusion = p;
		drowsy = q;
		sleep = r;
		emotion = s;
		irritable = t;
		sad = u;
		nervous = v;
	}
	
	public int totalSymp()
	{
		int total = 0;
		
		if (headache > 0)
		{
			total += headache;
		}
		if (pressure > 0)
		{
			total += pressure;
		}
		if (neck > 0)
		{
			total += neck;
		}
		if (vomit > 0)
		{
			total += vomit;
		}
		if (dizzy > 0)
		{
			total += dizzy;
		}
		if (blur > 0)
		{
			total += blur;
		}
		if (balance > 0)
		{
			total += balance;
		}
		if (light > 0)
		{
			total += light;
		}
		if (noise > 0)
		{
			total += noise;
		}
		if (slow > 0)
		{
			total += slow;
		}
		if (fog > 0)
		{
			total += fog;
		}
		if (right > 0)
		{
			total += right;
		}
		if (concentrate > 0)
		{
			total += concentrate;
		}
		if (remember > 0)
		{
			total += remember;
		}
		if (fatigue > 0)
		{
			total += fatigue;
		}
		if (confusion > 0)
		{
			total += confusion;
		}
		if (drowsy > 0)
		{
			total += drowsy;
		}
		if (sleep > 0)
		{
			total += sleep;
		}
		if (emotion > 0)
		{
			total += emotion;
		}
		if (irritable > 0)
		{
			total += irritable;
		}
		if (sad > 0)
		{
			total += sad;
		}
		if (nervous > 0)
		{
			total += nervous;
		}
		return total;
	}
	
	public int severity()
	{
		return headache + pressure + neck + vomit + dizzy + blur + balance + light + noise + slow + fog + right + concentrate + remember + fatigue + confusion+
				drowsy + sleep + emotion + irritable + sad +  nervous;
	}

}
