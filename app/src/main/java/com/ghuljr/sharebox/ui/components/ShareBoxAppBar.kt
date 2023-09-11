package com.ghuljr.sharebox.ui.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ghuljr.sharebox.ui.theme.ShareBoxTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ShareBoxAppBar(
    modifier: Modifier = Modifier,
    scrollBehaviour: TopAppBarScrollBehavior? = null,
    title: String = "",
    actions: @Composable RowScope.() -> Unit = {}
) {
    CenterAlignedTopAppBar(
        modifier = modifier,
        scrollBehavior = scrollBehaviour,
        actions = actions,
        title = {
            Text(
                text = title,
                style = MaterialTheme.typography.titleSmall,
            )
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview(
    showBackground = true,
    showSystemUi = true
)fun ShareBoxAppBarPreview() {
    ShareBoxTheme {
        ShareBoxAppBar(
            title = "Hello ShareBox!"
        )
    }
}