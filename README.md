# Yocto fb2png

This repo is a Yocto (tested with dunfell/imx6) integration of the wonderfull fb2png that can be found here : https://github.com/AndrewFromMelbourne/fb2png

It's basically a tool that allow the user to capture the framebuffer.

The integration is quite simple as I just had to simplify the Makefile. 

Yocto doesn't use the libpng-config so it needed to be replaced with more standard flags.
