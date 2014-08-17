#include <stdio.h>

static void greet(void);

int main(int argc, const char *argv[])
{
	greet();
	return 0;
}

static void greet(void)
{
	puts("hi");
}
