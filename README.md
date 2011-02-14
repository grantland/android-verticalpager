## VerticalPager

Intended as a ViewGroup that mimics the UIScrollView vertical paging functionality of iOS.

Supports:

Each child inherits the width and height of the VerticalPager. Swipe to page up
and down, or invoke scrollUp() and scrollDown() methods to accomplish the same.
OnScrollListener will report scroll and scroll-finished events (use to implement
a "current page number/position" view, for example). Much of the code for this
class was adapted from the Workspace class from the official Launcher app (AOSP).

modified from [http://code.google.com/p/deezapps-widgets/](http://code.google.com/p/deezapps-widgets/)