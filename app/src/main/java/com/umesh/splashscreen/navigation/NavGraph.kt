import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.umesh.splashscreen.SplashScreen
import com.umesh.splashscreen.navigation.Screen

@Composable
fun SetupNavGraph(navHostController: NavHostController) {
    
    NavHost(navController = navHostController, startDestination = Screen.Splash.route) {

        composable(route = Screen.Splash.route) {
            SplashScreen(navHostController = navHostController)
        }

        composable(route = Screen.Home.route) {
            Box(modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
                contentAlignment = Alignment.Center) {
                Text(text = "Home", color = Color.Black)
            }
        }
    }
}