# leitner-flashcard
Hinweis zum Programm:
Erarbeitet im Rahmen eines Studiumsprojekts. Keine Garantie, kein Support!

Allgemein:
Das vom Publizisten und Übersetzer Sebastian Leitner entworfene Lern-System basiert auf Karteikarten, welche in verschiedenen Fächern angeordnet werden. Alle richtig beantworteten Karteikarten werden dabei in das jeweils nächste Fach gelegt, falsch beantwortete Karten hingegen in das erste Fach.
Um den besten Lernerfolg zu erziehlen, sollten nicht alle Karten direkt nacheinander gemacht werden. Zum Biespiel kann man jeden Tag je Fach 1/n-tel der Karten nehmen, wobei n der Fachnummer entspricht.

Voraussetzungen:
Dieses Programm benötigt einen Computer mit grafischer Benutzeroberfläche (mind. 600x300px), Maus und Tastatur. Hierauf muss eine aktuelle Version von Java bzw. OpenJDK laufen.

Hinweis zur Navigation über die Kommandozeile:
Linux: Ordner öffnen mit "cd Ordnername", Ordnerinhalte anzeigen mit "ls".
Windows: Ordner öffnen mit "cd Ordnername", Ordnerinhalte anzeigen mit "dir"

Installation:
Die zum Programm gehörenden Dateien müssen in einem beliebigen, nicht schreibgeschützten Ordner gespeichert werden. Navigiere über die Kommandozeile  in den entsprechenden Ordner und führe den Befehl "javac Main" aus

Deinstallation:
Zum deinstallieren den gesamten Ordner löschen.

Starten des Programms:
Der Vokabeltrainer wird über die Kommandozeile gestartet. Hierzu muss in den betreffenden Ordner navigiert werden. Im betreffenden Ordner angelangt, wird der Vokabeltrainer mit "java Main" gestartet.

Startbildschirm:
Wähle aus, ob du neue Vokabeln hinzufügen möchtest oder mit bereits hinzugefügten Vokabeln lernen möchtest.

Vokabeln hinzufügen:
Gib die deutsche und die englische Bezeichnung ein und drücke auf "weiter". Wenn du fertig bist mit der Einagbe von Vokabeln, drücke auf "beenden" und du gelangst ins Menü zurück. Alternativ kannst du eine vordefinierte Liste mit einem Klick auf "Beispiel-Liste einfügen" verwenden.

Box-Übersicht:
Der Vokabeltrainer verfügt über 5 Boxen zum lernen sowie eine Aufbewahrungsbox für Karten, welche alle vorherigen Boxen durchlaufen haben. Zu jeder Box wird die Anzahl der darin enthaltenen Karten angezeigt. Nun kannst du für jede Box auswählen, ob du zu einem deutschen wort ein englisches finden willst (DE->EN lernen), du zu einem englischen Wort das deutsche finden willst (EN->DE lernen) oder du dies dem Zufall überlassen möchtest (Zufallsprinzip).
Karten in Box 6 kannst du entweder in Box 1 zurückschieben oder löschen.
Sofern eine Box leer ist, kannst du damit nicht lernen.

lernen:
Trage die Übersetzung des angegebenen Wortes (links) in das Feld (rechts) ein. Klicke anschließend auf "prüfen". War deine Antwort richtig, wird dies in grün angezeigt. War sie falsch, bekommst du in rot die richtige Lösung genannt. Gehe nun entweder auf "weiter", um zum nächsten Wort zu gelangen oder klicke auf "beenden", um in die Box-Übersicht zurückzugehen.
Hinweis: Mit einem Klick auf "prüfen" sthet das Ergebnis fest. Eine Änderung der Lösung ist danach nicht mehr möglich.
Hinweis: Die Buttons "weiter" und "beenden" können erst genutzt werden, nachdem du für das aktuelle Wort auf "prüfen" geklickt hast.
