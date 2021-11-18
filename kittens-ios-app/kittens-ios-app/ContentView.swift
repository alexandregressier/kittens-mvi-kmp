import SwiftUI
import KittensShared

struct ContentView: View {

	let greet = Greeting().greeting()

	var body: some View {
        Text(greet)
            .padding()
	}
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
