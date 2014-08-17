	.section	__TEXT,__text,regular,pure_instructions
	.globl	_main
	.align	4, 0x90
_main:                                  ## @main
Ltmp2:
	.cfi_startproc
## BB#0:
	pushq	%rbp
Ltmp3:
	.cfi_def_cfa_offset 16
Ltmp4:
	.cfi_offset %rbp, -16
	movq	%rsp, %rbp
Ltmp5:
	.cfi_def_cfa_register %rbp
	leaq	L_.str(%rip), %rdi
	callq	_puts
	xorl	%eax, %eax
	popq	%rbp
	ret
Ltmp6:
	.cfi_endproc
Leh_func_end0:

	.section	__TEXT,__cstring,cstring_literals
L_.str:                                 ## @.str
	.asciz	 "hi"


.subsections_via_symbols
