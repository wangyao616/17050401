import  math
from  tkinter import *
import tkinter.font as tkFont

win = Tk()
win.resizable(width=False, height=False)
win.geometry("800x400")
ft1 = tkFont.Font(size=20, weight=tkFont.BOLD)
ft2 = tkFont.Font(size=13)

framel_all = Frame(win, bg='red')
framel_all.place(x=0, y=0, height=400, width=100)
framel_all2 = Frame(win, bg='blue')
framel_all2.place(x=100, y=0, height=400, width=700)

expression1 = StringVar()
expression2 = StringVar()
expression3 = StringVar()
expression4 = StringVar()


def all():
    for widget in framel_all.winfo_children():
        widget.destroy()
    for widget in framel_all2.winfo_children():
        widget.destroy()
    Button(framel_all, text="选择一", command=one).place(x=20,y=130,height=25,width=60)
    Button(framel_all, text="选择二", command=two).place(x=20,y=230,height=25,width=60)

    Label(framel_all2, text="选项：", font=ft1).place(x=100, y=50)
    Label(framel_all2, text="1、估计某年计算机存储容量的需求与该年某字长存储器的价格.", font=ft2).place(x=170, y=130)
    Label(framel_all2, text="2:计算某年某字长存储器要使存储器装满程序所需用的成本.", font=ft2).place(x=170, y=200)

def conclusion():
    if expression1.get() and expression2.get():
        a = 4080 * math.exp(0.28 * (int(expression1.get()) - 1960))
        result1 = "存储器容量：" + str(4080 * math.exp(0.28 * (int(expression1.get()) - 1960)))
        result2 = "此存储器价格：" + str((0.003 * int(expression2.get()) * 0.72 ** (int(expression1.get()) - 1974)) * a)
        Label(framel_all2, text=result1, font=ft2).place(x=200, y=300)
        Label(framel_all2, text=result2, font=ft2).place(x=200, y=350)


def conclusion1():
    if expression1.get() and expression2.get() and expression3.get() and expression4.get():
        a = 4080 * math.exp(0.28 * (int(expression1.get()) - 1960))
        result1 = "存储器容量：" + str(4080 * math.exp(0.28 * (int(expression1.get()) - 1960)))
        result2 = "此存储器价格：" + str((0.003 * int(expression2.get()) * 0.72 ** (int(expression1.get()) - 1974)) * a)
        result3 = "装满成本：" + str((a / (int(expression3.get()) * 20)) * int(expression4.get()))
        Label(framel_all2, text=result1, font=ft2).place(x=200, y=300)
        Label(framel_all2, text=result2, font=ft2).place(x=200, y=330)
        Label(framel_all2, text=result3, font=ft2).place(x=200, y=360)


def one():
    for widget in framel_all.winfo_children():
        widget.destroy()
    for widget in framel_all2.winfo_children():
        widget.destroy()
    Button(framel_all, text="返 回", command=all).place(x=20,y=130,height=25,width=60)

    Label(framel_all2, text="请分别输入年份与字长：", font=ft1).place(x=10, y=50)
    Label(framel_all2, text="年 份", font=ft2).place(x=240, y=130)
    Label(framel_all2, text="字 长", font=ft2).place(x=240, y=200)

    entry1 = Entry(framel_all2)
    entry1["textvariable"] = expression1

    entry2 = Entry(framel_all2)
    entry2["textvariable"] = expression2

    entry1.place(x=300,y=130,height=20,width=170)
    entry2.place(x=300, y=200, height=20, width=170)

    Button(framel_all2, text="输出结果", command=conclusion).place(x=100,y=300,height=25,width=60)





def two():
    for widget in framel_all.winfo_children():
        widget.destroy()
    for widget in framel_all2.winfo_children():
        widget.destroy()
    Button(framel_all, text="返 回", command=all).place(x=20, y=130, height=25, width=60)

    Label(framel_all2, text="请分别输入年份与字长：", font=ft1).place(x=10, y=50)
    Label(framel_all2, text="年  份", font=ft2).place(x=170, y=110)
    Label(framel_all2, text="字  长", font=ft2).place(x=170, y=150)
    Label(framel_all2, text="每天开发指令数", font=ft2).place(x=170, y=190)
    Label(framel_all2, text="月工资", font=ft2).place(x=170, y=230)

    entry1 = Entry(framel_all2)
    entry1["textvariable"] = expression1

    entry2 = Entry(framel_all2)
    entry2["textvariable"] = expression2

    entry3 = Entry(framel_all2)
    entry3["textvariable"] = expression3

    entry4 = Entry(framel_all2)
    entry4["textvariable"] = expression4

    entry1.place(x=300, y=110, height=20, width=170)
    entry2.place(x=300, y=150, height=20, width=170)
    entry3.place(x=300, y=190, height=20, width=170)
    entry4.place(x=300, y=230, height=20, width=170)

    Button(framel_all2, text="输出结果", command=conclusion1).place(x=100, y=300, height=25, width=60)

all()

win.mainloop()