---
title: set_header Methode
second_title: Aspose.Cells for Python via .NET API Referenzen
description:
type: docs
weight: 200
url: /de/aspose.cells/pagesetup/set_header/
is_root: false
---
##  set_header(self, section, header_script) {#int-str}
Legt ein Skript fest, das die Kopfzeile einer Excel-Datei formatiert.



```python

def set_header(self, section, header_script):
    ...
```


| Parameter| Typ| Beschreibung|
| :- | :- | :- |
| section | int |0: Linker Abschnitt, 1: Mittlerer Abschnitt, 2: Rechter Abschnitt.|
| header_script | str | Skript zur Header-Formatierung.|
###  Bemerkungen

Skriptbefehle:

| Befehl| Beschreibung|
| :- | :- |
| &P| Aktuelle Seitenzahl|
| &N| Seitenanzahl|
| &D| Aktuelles Datum|
| &T| Aktuelle Uhrzeit|
| &A| Blattname|
| &F| Dateiname ohne Pfad|
| &"<FontName>"|Schriftartname, zum Beispiel: &"Arial"|
| &"<FontName>, <FontStyle>"| Schriftartname und Schriftstil, zum Beispiel: &"Arial,Bold"|
| &<FontSize>| Schriftgröße. Folgt diesem Befehl eine Zahl, die in der Kopfzeile gedruckt werden soll, wird diese durch ein Leerzeichen von der Schriftgröße getrennt.|
| &K<RRGGBB>| Schriftfarbe, zum Beispiel (ROT): &KFF0000|
| &G| Bildskript|

Beispiel: „&Arial,Bold&8Header Note“


###  Siehe auch
* Modul [`aspose.cells`](../../)
* Klasse [`PageSetup`](/cells/python-net/de/aspose.cells/pagesetup)
