import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class aNameCount {

	public static void main(String[] args) {
		
		ArrayList <String> names = new ArrayList <String>();
		names.add("Adam");
		names.add("Alex");
		names.add("Panda");
		names.add("Amber");
		names.add("Sumit");
		
		Long c = 	names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
		Long d = Stream.of("Adam","Alex","Panda","Amber","Sumit").filter(s->
		{
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d);
		
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
		Stream.of("Adam","Alex","Panda","Amber","Sumit").filter(s->s.endsWith("r")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		Stream.of("Adam","Alex","Panda","Amber","Sumit").sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		List<String> namesv2 = Arrays.asList("Roy","Shazam","Menon","Wolverine");
		
		Stream<String> newStream = Stream.concat(names.stream(),namesv2.stream());
		newStream.sorted().forEach(s->System.out.println(s));
		
		List<Integer> val = Arrays.asList(1,2,4,5,3,2,3,5,5,7,9);
		val.stream().distinct().forEach(s->System.out.println(s));
		List <Integer> li = val.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
		
	}

}
