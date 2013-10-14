CheckConnectionDemo
===================
This is a demo project to demonstrate how to check for internet connection and any other network connection .
The steps are very easy .

Steps 1: Give user-permission in the android manifest file .
Step 2: Create a separate class to check for the internet connection.
Step 3: Call the class function in the main acitivity.

____________________________________________________________________________________________________________________________________________________________
Steps 1: Give user-permission in the android manifest file .

<uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>

____________________________________________________________________________________________________________________________________________________________
Step 2: Create a separate class to check for the internet connection.

	public boolean isConnectedToInternet() {
		ConnectivityManager connectivity = (ConnectivityManager) _context
				.getSystemService(Context.CONNECTIVITY_SERVICE);
		if (connectivity != null) {
			NetworkInfo[] info = connectivity.getAllNetworkInfo();
			if (info != null) {
				for (int i = 0; i < info.length; i++)
					if (info[i].getState() == NetworkInfo.State.CONNECTED)
						return true;
			}
		}
		return false;
	}

____________________________________________________________________________________________________________________________________________________________
Step 3: Call the class function in the main acitivity.


		checkConnection();

	public void checkConnection() {
		ConnectionDetector connectionDetector = new ConnectionDetector(this);
		if (connectionDetector.isConnectedToInternet())
			textView.setText("connected");
		else
			textView.setText("Not Connected");
	}

