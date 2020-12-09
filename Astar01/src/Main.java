// https://gist.github.com/raymondchua/8064159

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Coloque o seu nó de origem:");
		String condicaoOrigem = scanner.next();

		System.out.print("Coloque o seu nó de destino:");
		String condicaoDestino = scanner.next();

		Node noInicio = null;
		Node noFim = null;
		// initialize the graph base on the Romania map
		// DISTANCIA HEURISTICA
		Node n1 = null;
		Node n2 = null;
		Node n3 = null;
		Node n4 = null;
		Node n5 = null;
		Node n6 = null;
		Node n7 = null;
		Node n8 = null;
		Node n9 = null;
		Node n10 = null;
		Node n11 = null;
		Node n12 = null;
		Node n13 = null;
		Node n14 = null;

		if (condicaoDestino.toUpperCase().equals("E1")) {
			n1 = new Node("E1", 0);
			n2 = new Node("E2", 10);
			n3 = new Node("E3", 18.5);
			n4 = new Node("E4", 24.8);
			n5 = new Node("E5", 36.4);
			n6 = new Node("E6", 38.8);
			n7 = new Node("E7", 35.8);
			n8 = new Node("E8", 25.4);
			n9 = new Node("E9", 17.6);
			n10 = new Node("E10", 9.1);
			n11 = new Node("E11", 16.7);
			n12 = new Node("E12", 27.3);
			n13 = new Node("E13", 27.6);
			n14 = new Node("E14", 29.8);
		} else if (condicaoDestino.toUpperCase().equals("E2")) {
			n1 = new Node("E1", 10);
			n2 = new Node("E2", 0);
			n3 = new Node("E3", 8.5);
			n4 = new Node("E4", 14.8);
			n5 = new Node("E5", 26.6);
			n6 = new Node("E6", 29.1);
			n7 = new Node("E7", 26.1);
			n8 = new Node("E8", 17.3);
			n9 = new Node("E9", 10);
			n10 = new Node("E10", 3.5);
			n11 = new Node("E11", 15.5);
			n12 = new Node("E12", 20.9);
			n13 = new Node("E13", 19.1);
			n14 = new Node("E14", 21.8);

		} else if (condicaoDestino.toUpperCase().equals("E3")) {
			n1 = new Node("E1", 18.5);
			n2 = new Node("E2", 8.5);
			n3 = new Node("E3", 0);
			n4 = new Node("E4", 6.3);
			n5 = new Node("E5", 18.2);
			n6 = new Node("E6", 20.6);
			n7 = new Node("E7", 17.6);
			n8 = new Node("E8", 13.6);
			n9 = new Node("E9", 9.4);
			n10 = new Node("E10", 10.3);
			n11 = new Node("E11", 19.5);
			n12 = new Node("E12", 19.1);
			n13 = new Node("E13", 12.1);
			n14 = new Node("E14", 16.6);

		} else if (condicaoDestino.toUpperCase().equals("E4")) {
			n1 = new Node("E1", 24.8);
			n2 = new Node("E2", 14.8);
			n3 = new Node("E3", 6.3);
			n4 = new Node("E4", 0);
			n5 = new Node("E5", 12);
			n6 = new Node("E6", 14.4);
			n7 = new Node("E7", 11.5);
			n8 = new Node("E8", 12.4);
			n9 = new Node("E9", 12.6);
			n10 = new Node("E10", 16.7);
			n11 = new Node("E11", 23.6);
			n12 = new Node("E12", 18.6);
			n13 = new Node("E13", 10.6);
			n14 = new Node("E14", 15.4);

		} else if (condicaoDestino.toUpperCase().equals("E5")) {
			n1 = new Node("E1", 36.4);
			n2 = new Node("E2", 26.6);
			n3 = new Node("E3", 18.2);
			n4 = new Node("E4", 12);
			n5 = new Node("E5", 0);
			n6 = new Node("E6", 3);
			n7 = new Node("E7", 2.4);
			n8 = new Node("E8", 19.4);
			n9 = new Node("E9", 23.3);
			n10 = new Node("E10", 28.2);
			n11 = new Node("E11", 34.2);
			n12 = new Node("E12", 24.8);
			n13 = new Node("E13", 14.5);
			n14 = new Node("E14", 17.9);

		} else if (condicaoDestino.toUpperCase().equals("E6")) {
			n1 = new Node("E1", 38.8);
			n2 = new Node("E2", 29.1);
			n3 = new Node("E3", 20.6);
			n4 = new Node("E4", 14.4);
			n5 = new Node("E5", 3);
			n6 = new Node("E6", 0);
			n7 = new Node("E7", 3.3);
			n8 = new Node("E8", 22.3);
			n9 = new Node("E9", 25.7);
			n10 = new Node("E10", 30.3);
			n11 = new Node("E11", 36.7);
			n12 = new Node("E12", 27.6);
			n13 = new Node("E13", 15.2);
			n14 = new Node("E14", 18.2);

		} else if (condicaoDestino.toUpperCase().equals("E7")) {
			n1 = new Node("E1", 35.8);
			n2 = new Node("E2", 26.1);
			n3 = new Node("E3", 17.6);
			n4 = new Node("E4", 11.5);
			n5 = new Node("E5", 2.4);
			n6 = new Node("E6", 3.3);
			n7 = new Node("E7", 0);
			n8 = new Node("E8", 20);
			n9 = new Node("E9", 23);
			n10 = new Node("E10", 27.3);
			n11 = new Node("E11", 34.2);
			n12 = new Node("E12", 25.7);
			n13 = new Node("E13", 12.4);
			n14 = new Node("E14", 15.6);

		} else if (condicaoDestino.toUpperCase().equals("E8")) {
			n1 = new Node("E1", 25.4);
			n2 = new Node("E2", 17.3);
			n3 = new Node("E3", 13.6);
			n4 = new Node("E4", 12.4);
			n5 = new Node("E5", 19.4);
			n6 = new Node("E6", 22.3);
			n7 = new Node("E7", 20);
			n8 = new Node("E8", 0);
			n9 = new Node("E9", 8.2);
			n10 = new Node("E10", 20.3);
			n11 = new Node("E11", 16.1);
			n12 = new Node("E12", 6.4);
			n13 = new Node("E13", 22.7);
			n14 = new Node("E14", 27.6);

		} else if (condicaoDestino.toUpperCase().equals("E9")) {
			n1 = new Node("E1", 17.6);
			n2 = new Node("E2", 10);
			n3 = new Node("E3", 9.4);
			n4 = new Node("E4", 12.6);
			n5 = new Node("E5", 23.3);
			n6 = new Node("E6", 25.7);
			n7 = new Node("E7", 23);
			n8 = new Node("E8", 8.2);
			n9 = new Node("E9", 0);
			n10 = new Node("E10", 13.5);
			n11 = new Node("E11", 11.2);
			n12 = new Node("E12", 10.9);
			n13 = new Node("E13", 21.2);
			n14 = new Node("E14", 26.6);

		} else if (condicaoDestino.toUpperCase().equals("E10")) {
			n1 = new Node("E1", 9.1);
			n2 = new Node("E2", 3.5);
			n3 = new Node("E3", 10.3);
			n4 = new Node("E4", 16.7);
			n5 = new Node("E5", 28.2);
			n6 = new Node("E6", 30.3);
			n7 = new Node("E7", 27.3);
			n8 = new Node("E8", 20.3);
			n9 = new Node("E9", 13.5);
			n10 = new Node("E10", 0);
			n11 = new Node("E11", 17.6);
			n12 = new Node("E12", 24.2);
			n13 = new Node("E13", 18.7);
			n14 = new Node("E14", 21.2);

		} else if (condicaoDestino.toUpperCase().equals("E11")) {
			n1 = new Node("E1", 16.7);
			n2 = new Node("E2", 15.5);
			n3 = new Node("E3", 19.5);
			n4 = new Node("E4", 23.6);
			n5 = new Node("E5", 34.2);
			n6 = new Node("E6", 36.7);
			n7 = new Node("E7", 34.2);
			n8 = new Node("E8", 16.1);
			n9 = new Node("E9", 11.2);
			n10 = new Node("E10", 17.6);
			n11 = new Node("E11", 0);
			n12 = new Node("E12", 14.2);
			n13 = new Node("E13", 31.5);
			n14 = new Node("E14", 35.5);

		} else if (condicaoDestino.toUpperCase().equals("E12")) {
			n1 = new Node("E1", 27.3);
			n2 = new Node("E2", 20.9);
			n3 = new Node("E3", 19.1);
			n4 = new Node("E4", 18.6);
			n5 = new Node("E5", 24.8);
			n6 = new Node("E6", 27.6);
			n7 = new Node("E7", 25.7);
			n8 = new Node("E8", 6.4);
			n9 = new Node("E9", 10.9);
			n10 = new Node("E10", 24.2);
			n11 = new Node("E11", 14.2);
			n12 = new Node("E12", 0);
			n13 = new Node("E13", 28.8);
			n14 = new Node("E14", 33.6);

		} else if (condicaoDestino.toUpperCase().equals("E13")) {
			n1 = new Node("E1", 27.6);
			n2 = new Node("E2", 19.1);
			n3 = new Node("E3", 12.1);
			n4 = new Node("E4", 16.6);
			n5 = new Node("E5", 14.5);
			n6 = new Node("E6", 15.2);
			n7 = new Node("E7", 12.4);
			n8 = new Node("E8", 22.7);
			n9 = new Node("E9", 21.2);
			n10 = new Node("E10", 18.7);
			n11 = new Node("E11", 31.5);
			n12 = new Node("E12", 28.8);
			n13 = new Node("E13", 0);
			n14 = new Node("E14", 5.1);

		} else {
			n1 = new Node("E1", 29.8);
			n2 = new Node("E2", 21.8);
			n3 = new Node("E3", 16.6);
			n4 = new Node("E4", 15.4);
			n5 = new Node("E5", 17.9);
			n6 = new Node("E6", 18.2);
			n7 = new Node("E7", 15.6);
			n8 = new Node("E8", 27.6);
			n9 = new Node("E9", 26.6);
			n10 = new Node("E10", 21.2);
			n11 = new Node("E11", 35.5);
			n12 = new Node("E12", 33.6);
			n13 = new Node("E13", 5.1);
			n14 = new Node("E14", 0);

		}

		// initialize the edges

		// E1
		n1.adjacencies = new Edge[] { new Edge(n2, 10),

		};
		// E2
		n2.adjacencies = new Edge[] { new Edge(n1, 10), new Edge(n3, 8.5), new Edge(n9, 10), new Edge(n10, 3.5)

		};
		// E3
		n3.adjacencies = new Edge[] { new Edge(n2, 8.5), new Edge(n4, 6.3), new Edge(n9, 9.4), new Edge(n13, 18.7) };

		// E4
		n4.adjacencies = new Edge[] { new Edge(n3, 6.3), new Edge(n5, 13), new Edge(n8, 15.3), new Edge(n13, 12.8), };

		// E5
		n5.adjacencies = new Edge[] { new Edge(n4, 13), new Edge(n6, 3), new Edge(n7, 2.4), new Edge(n8, 30), };

		// E6
		n6.adjacencies = new Edge[] { new Edge(n5, 3),

		};

		// E7
		n7.adjacencies = new Edge[] { new Edge(n5, 2.4),

		};

		// E8
		n8.adjacencies = new Edge[] { new Edge(n4, 15.3), new Edge(n5, 30), new Edge(n9, 9.6), new Edge(n12, 6.4) };

		// E9
		n9.adjacencies = new Edge[] { new Edge(n2, 10), new Edge(n3, 9.4), new Edge(n8, 9.6), new Edge(n11, 12.2) };

		// E10
		n10.adjacencies = new Edge[] { new Edge(n2, 3.5),

		};

		// E11
		n11.adjacencies = new Edge[] { new Edge(n9, 12.2),

		};

		// E12
		n12.adjacencies = new Edge[] { new Edge(n8, 6.4),

		};

		// E13
		n13.adjacencies = new Edge[] { new Edge(n3, 18.7), new Edge(n4, 12.8), new Edge(n14, 5.1) };

		// E14
		n14.adjacencies = new Edge[] { new Edge(n13, 5.1) };

		// CONDICAO ORIGEM

		if (condicaoOrigem.toUpperCase().equals("E1")) {
			noInicio = n1;

		} else if (condicaoOrigem.toUpperCase().equals("E2")) {
			noInicio = n2;
		} else if (condicaoOrigem.toUpperCase().equals("E3")) {
			noInicio = n3;
		} else if (condicaoOrigem.toUpperCase().equals("E4")) {
			noInicio = n4;
		} else if (condicaoOrigem.toUpperCase().equals("E5")) {
			noInicio = n5;
		} else if (condicaoOrigem.toUpperCase().equals("E6")) {
			noInicio = n6;
		} else if (condicaoOrigem.toUpperCase().equals("E7")) {
			noInicio = n7;
		} else if (condicaoOrigem.toUpperCase().equals("E8")) {
			noInicio = n8;
		} else if (condicaoOrigem.toUpperCase().equals("E9")) {
			noInicio = n9;
		} else if (condicaoOrigem.toUpperCase().equals("E10")) {
			noInicio = n10;
		} else if (condicaoOrigem.toUpperCase().equals("E11")) {
			noInicio = n11;
		} else if (condicaoOrigem.toUpperCase().equals("E12")) {
			noInicio = n12;
		} else if (condicaoOrigem.toUpperCase().equals("E13")) {
			noInicio = n13;
		} else {
			noInicio = n14;
		}

		// CONDICAO DE DESTINO

		if (condicaoDestino.toUpperCase().equals("E1")) {
			noFim = n1;

		} else if (condicaoDestino.toUpperCase().equals("E2")) {
			noFim = n2;
		} else if (condicaoDestino.toUpperCase().equals("E3")) {
			noFim = n3;
		} else if (condicaoDestino.toUpperCase().equals("E4")) {
			noFim = n4;
		} else if (condicaoDestino.toUpperCase().equals("E5")) {
			noFim = n5;
		} else if (condicaoDestino.toUpperCase().equals("E6")) {
			noFim = n6;
		} else if (condicaoDestino.toUpperCase().equals("E7")) {
			noFim = n7;
		} else if (condicaoDestino.toUpperCase().equals("E8")) {
			noFim = n8;
		} else if (condicaoDestino.toUpperCase().equals("E9")) {
			noFim = n9;
		} else if (condicaoDestino.toUpperCase().equals("E10")) {
			noFim = n10;
		} else if (condicaoDestino.toUpperCase().equals("E11")) {
			noFim = n11;
		} else if (condicaoDestino.toUpperCase().equals("E12")) {
			noFim = n12;
		} else if (condicaoDestino.toUpperCase().equals("E13")) {
			noFim = n13;
		} else {
			noFim = n14;
		}

		AstarSearch(noInicio, noFim);

		List<Node> path = printPath(noFim);

		System.out.println("Caminho percorrido: " + path);

	}

	public static List<Node> printPath(Node target) {
		List<Node> path = new ArrayList<Node>();

		for (Node node = target; node != null; node = node.parent) {
			path.add(node);
		}

		Collections.reverse(path);

		return path;
	}

	public static void AstarSearch(Node source, Node goal) {

		Set<Node> explored = new HashSet<Node>();

		PriorityQueue<Node> queue = new PriorityQueue<Node>(20, new Comparator<Node>() {
			// override compare method
			public int compare(Node i, Node j) {
				if (i.f_scores > j.f_scores) {
					return 1;
				}

				else if (i.f_scores < j.f_scores) {
					return -1;
				}

				else {
					return 0;
				}
			}

		});

		// cost from start
		source.g_scores = 0;

		queue.add(source);

		boolean found = false;

		while ((!queue.isEmpty()) && (!found)) {

			// the node in having the lowest f_score value
			Node current = queue.poll();

			explored.add(current);

			// goal found
			if (current.value.equals(goal.value)) {
				found = true;
				System.out.println(
						"********************************************************************************************************");
				System.out.println("************CHEGAMOS AO NOSSO DESTINO!!!*******************");
				System.out.println("Nó atual ------- " + current.value + " --------"
						+ "Valor do nó inicial até o nó atual: " + current.g_scores);
				System.out.println("Distancia percorrida: " + current.g_scores + "Km/h");
				System.out.println("Tempo de viagem: " + (current.g_scores / 30) * 60 + " Minutos");

			} else {
				System.out.println(
						"********************************************************************************************************");
				System.out.println("Nó atual ------- " + current.value + " --------"
						+ "Valor do nó inicial até o nó atual: " + current.g_scores);

			}

			// check every child of current node
			int i = 0;

			for (Edge e : current.adjacencies) {
				Node child = e.target;
				double cost = e.cost;
				double temp_g_scores = current.g_scores + cost;
				double temp_f_scores = temp_g_scores + child.h_scores;

				/*
				 * if child node has been evaluated and the newer f_score is higher, skip
				 */

				if ((explored.contains(child)) && (temp_f_scores >= child.f_scores)) {
					continue;
				}

				/*
				 * else if child node is not in queue or newer f_score is lower
				 */

				else if ((!queue.contains(child)) || (temp_f_scores < child.f_scores)) {

					child.parent = current;
					child.g_scores = temp_g_scores;
					child.f_scores = temp_f_scores;

					if (queue.contains(child)) {
						queue.remove(child);
					}

					queue.add(child);

				}

				if (found) {

					// System.out.println("********************************************************************************************************");

				} else {
					System.out.println("Seus filhos: " + child.value + " (" + " g(n): " + temp_g_scores + " --- h(n): "
							+ child.h_scores + " --- f(n): " + temp_f_scores + ")");

				}

				i++;

			}

		}

	}

}

class Node {

	public final String value;
	public double g_scores;
	public final double h_scores;
	public double f_scores = 0;
	public Edge[] adjacencies;
	public Node parent;

	public Node(String val, double hVal) {
		value = val;
		h_scores = hVal;
	}

	public String toString() {
		return value;
	}

}

class Edge {
	public final double cost;
	public final Node target;

	public Edge(Node targetNode, double costVal) {
		target = targetNode;
		cost = costVal;
	}
}