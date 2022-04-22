from tkinter import END
import tkinter
import keyboard
import time
from rich.progress import track
from rich.console import Console
import webbrowser




keyboard.press('f11')
c=Console()

c.print('[link=https://github.com/ItsemeFabi]Made by Fabi[/link]')
url = "https://github.com/ItsemeFabi"
webbrowser.open(url, new=0, autoraise=True)

def process_data():
    time.sleep(0.01)
for _ in track(range(100), description='[green]Processing data'):
    process_data()

speicherergebnis = 1.0
erg = 0.0
print('Drücke t zum Starten des Taschenrechners') 

while True:
    if keyboard.is_pressed('t'):  
            print('Taschenrechner wird gestartet...')
            time.sleep(2.0)
            f = 0
            while(f<=170):
                c.print('.'*f, style = 'bright_green')
                c.print((' ')*(170-f) + ('.'*f), style='bright_yellow')
                f = f+1
                time.sleep(0.001)
            while(f>0):
                print('.'*f)
                print((' ')*(170-f) + ('.'*f))
                f = f-1
                time.sleep(0.001)
            break
print('Taschenrechner gestartet!')
time.sleep(1.0)
print('Hallo, ich bin der Taschenrechner')
time.sleep(1.1)
print('Bitte drücke "A" zum Addieren, "S" zum Subtrahieren, "M" zum Multiplizieren, "D" zum Dividieren')     
while True:
    if(keyboard.is_pressed('a')):
        print('Ausgewählt: Addieren')
        print('Gib nun alle Zahlen ein, die addiert werden sollen. Falls du keine Zahl mehr hinzufügen möchtest, schreibe "0"')
        num_1=0
        if(speicherergebnis != 0):
            num_1 = int(input('Zahl 1: '))
        else:
            erg = speicherergebnis
        zahl=2
        while num_1 != 0:
            erg = erg + num_1
            num_1 = int(input(('Zahl '+str(zahl)+': ')))
            zahl = zahl +1
        print('Das Ergebnis ist ' + str(erg))
        time.sleep(1.0)
        print('Möchtest du dieses Ergebnis speichern(Dieses Ergebnis wird in der nächsten Rechnung als Anfangswert verwendet), dann drücke "w, anderenfalls drücke "n"')
        while True:
            if(keyboard.is_pressed('w')):
                speicherergebnis = erg
                break
            elif(keyboard.is_pressed('n')):
                print('Ergebnis nicht gespeichert')
                speicherergebnis = 0
                break
        print('Du kannst nun wieder Rechnen, drücke A, S, M, D oder mit Z beenden')
    
    elif(keyboard.is_pressed('d')):
        print('Ausgewählt: Dividieren')
        print('Gib nun alle Zahlen ein, die dividiert werden sollen. Falls du keine Zahl mehr hinzufügen möchtest, schreibe "0"')
        num_1=1
        if(speicherergebnis == 0):
            num_1 = int(input('Zahl 1: '))
            erg = 1
            zahl = 2
        else:
            erg = speicherergebnis
            zahl = 1
        
        while num_1 != 0:
            erg = erg / num_1
            num_1 = int(input(('Zahl '+str(zahl)+': ')))
            zahl = zahl +1
        print('Das Ergebnis ist ' + str(erg))
        time.sleep(1.0)
        print('Möchtest du dieses Ergebnis speichern(Dieses Ergebnis wird in der nächsten Rechnung als Anfangswert verwendet), dann drücke "w, anderenfalls drücke "n"')
        while True:
            if(keyboard.is_pressed('w')):
                print('Ergebnis gespeichert')
                speicherergebnis = erg
                break
            elif(keyboard.is_pressed('n')):
                print('Ergebnis nicht gespeichert')
                speicherergebnis = 0
                break
        print('Du kannst nun wieder Rechnen, drücke A, S, M, D oder Z')
    
    elif(keyboard.is_pressed('s')):
        print('Ausgewählt: Subtrahieren')
        print('Gib nun alle Zahlen ein, die subtrahiert werden sollen(Bitte beachte, dass alle weiteren Zahlen von der ersten abgezogen werden). Möchtest du alle Zahlen von 0 abziehen, bitte drücke "n", anderenfalls drücke "l". Falls du keine Zahl mehr hinzufügen möchtest, schreibe "0"')
        num_1=0
        if(speicherergebnis != 0):
            num_1 = int(input('Zahl 1: '))
        else:
            erg = speicherergebnis
        zahl=2
        while num_1 != 0:
            erg = erg - num_1
            num_1 = int(input(('Zahl '+str(zahl)+': ')))
            zahl = zahl +1
        print('Das Ergebnis ist ' + str(erg))
        time.sleep(1.0)
        print('Möchtest du dieses Ergebnis speichern(Dieses Ergebnis wird in der nächsten Rechnung als Anfangswert verwendet), dann drücke "w, anderenfalls drücke "n"')
        while True:
            if(keyboard.is_pressed('w')):
                speicherergebnis = erg
                break
            elif(keyboard.is_pressed('n')):
                print('Ergebnis nicht gespeichert')
                speicherergebnis = 0
                break
        print('Du kannst nun wieder Rechnen, drücke A, S, M, D oder mit Z beenden' )
    
    elif(keyboard.is_pressed('m')):
        print('Ausgewählt: Multiplizieren')
        print('Gib nun alle Zahlen ein, die multipliziert werden sollen. Falls du keine Zahl mehr hinzufügen möchtest, schreibe "0"')
        num_1=1
        if(speicherergebnis == 0):
            num_1 = int(input('Zahl 1: '))
            erg = 1
            zahl = 2
        else:
            erg = speicherergebnis
            zahl = 1
        
        while num_1 != 0:
            erg = erg * num_1
            num_1 = int(input(('Zahl '+str(zahl)+': ')))
            zahl = zahl +1
        print('Das Ergebnis ist: '+ str(erg))
        time.sleep(1.0)
        print('Möchtest du dieses Ergebnis speichern(Dieses Ergebnis wird in der nächsten Rechnung als Anfangswert verwendet), dann drücke "w", anderenfalls drücke "n"')
        while True:
            if(keyboard.is_pressed('w')):
                speicherergebnis = erg
                break
            elif(keyboard.is_pressed('n')):
                print('Ergebnis nicht gespeichert')
                speicherergebnis = 0
                break
                
        print('Du kannst nun wieder Rechnen, drücke A, S, M, D oder mit Z beenden')

    elif(keyboard.is_pressed('z')):
        print('Taschenrechner beendet')
        time.sleep(2.0)
        f = 170
        while(f>0):
                c.print('.'*f, style='blue')
                c.print((' ')*(170-f) + ('.'*f), style='blue')
                f = f-1
                time.sleep(0.001)         
        #while(f<=170):
                # print('.'*f)
                # print((' ')*(170-f) + ('.'*f))
                # f = f+1
                # time.sleep(0.001)
        exit()   
        