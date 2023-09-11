package com.ghuljr.sharebox.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.tooling.preview.Preview
import com.ghuljr.sharebox.ui.components.ShareBoxAppBar
import com.ghuljr.sharebox.ui.theme.ShareBoxTheme
import com.ghuljr.sharebox.ui.utils.loremIpsum

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NoteScreen() {
    val scrollBehaviour = TopAppBarDefaults.pinnedScrollBehavior()
    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehaviour.nestedScrollConnection),
        topBar = {
            ShareBoxAppBar(
                title = "ShareBox",
                scrollBehaviour = scrollBehaviour
            )
        }
    ) { contentPadding ->
        Greeting(
            modifier = Modifier.padding(contentPadding),
            name = loremIpsum()
        )
    }
}

@Composable
@Preview(
    showBackground = true,
    showSystemUi = true
)
fun NoteScreenPreview() {
    ShareBoxTheme {
        Surface {
            NoteScreen()
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val scrollState = rememberScrollState(0)
    Text(
        modifier = modifier.verticalScroll(scrollState),
        text = "Hello $name!",
        style = MaterialTheme.typography.bodySmall
    )
}