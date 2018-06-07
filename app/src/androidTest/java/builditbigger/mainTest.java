package builditbigger;

import android.os.SystemClock;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.udacity.gradle.builditbigger.MainActivity;
import com.udacity.gradle.builditbigger.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;

/**
 * Created by Eh on 9/3/2017.
 */
@RunWith(AndroidJUnit4.class)
public class mainTest {
    @Rule
    public ActivityTestRule<MainActivity> mainActivityTestRule= new ActivityTestRule<MainActivity>(MainActivity.class);
    @Test
    public void ClickDisplayedRecipe() {

        onView(withId(R.id.b1)).perform(click());
        SystemClock.sleep(2000);
        onView(withId(R.id.textView))
                .check(matches(not(withText(""))));
    }
}
