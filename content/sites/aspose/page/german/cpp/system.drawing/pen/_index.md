---
title: "System::Drawing::Pen Klasse"
linktitle: "Stift"
second_title: "Aspose.Page für C++"
description: "System::Drawing::Pen Klasse. Stellt Eigenschaften wie Farbe, Breite usw. der gezeichneten Linien und Kurven dar. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1500
url: /de/cpp/system.drawing/pen/
---
## Pen class


Stellt Eigenschaften wie Farbe, Breite usw. der gezeichneten Linien und Kurven dar. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class Pen : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clone](./clone/)() | Gibt eine Kopie des aktuellen Objekts zurück. |
| [Dispose](./dispose/)() | Gibt alle vom aktuellen Objekt erworbenen Betriebsressourcen frei. |
| [get_Alignment](./get_alignment/)() const | Gibt einen Wert zurück, der die Ausrichtung des aktuellen [Pen](./)-Objekts angibt. |
| [get_Brush](./get_brush/)() | Gibt das [Brush](../brush/)-Objekt dieses Stifts zurück. |
| [get_Color](./get_color/)() const | Gibt die Farbe dieses Stifts zurück. |
| [get_CompoundArray](./get_compoundarray/)() const | Gibt ein Array von Werten zurück, das einen zusammengesetzten Pen spezifiziert. |
| [get_DashCap](./get_dashcap/)() const | Gibt einen Wert zurück, der die an beiden Enden einer gestrichelten Linie verwendete Kappe angibt. |
| [get_DashOffset](./get_dashoffset/)() const | Gibt den Abstand vom Anfang einer Linie bis zum Beginn eines Strichmusters zurück. |
| [get_DashPattern](./get_dashpattern/)() const | Gibt ein Array zurück, das ein benutzerdefiniertes Strichmuster in einer gestrichelten Linie angibt. |
| [get_DashStyle](./get_dashstyle/)() const | Gibt einen Wert zurück, der den Strichstil des aktuellen [Pen](./)-Objekts angibt. |
| [get_EndCap](./get_endcap/)() const | Gibt einen Wert zurück, der die Endkappe der Linie des aktuellen [Pen](./)-Objekts angibt. |
| [get_LineJoin](./get_linejoin/)() const | Gibt einen Wert zurück, der angibt, wie die von diesem [Pen](./)-Objekt gezeichneten Linien verbunden werden. |
| [get_MiterLimit](./get_miterlimit/)() const | Gibt die Grenze der Dicke der Verbindung an einer Gehrungsecke zurück. |
| [get_PenType](./get_pentype/)() const | NICHT IMPLEMENTIERT. |
| [get_StartCap](./get_startcap/)() const | Gibt einen Wert zurück, der die Startkappe der Linie des aktuellen [Pen](./)-Objekts angibt. |
| [get_Transform](./get_transform/)() | Gibt eine Kopie eines Matrix-Objekts zurück, das die geometrischen Transformationen für den vom aktuellen Objekt dargestellten Pen spezifiziert. |
| [get_Width](./get_width/)() const | Gibt die Breite des aktuellen [Pen](./)-Objekts zurück. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Drawing2D::Matrix\>\&, Drawing2D::MatrixOrder) | Multipliziert die Transformationsmatrix des aktuellen Objekts mit der angegebenen Matrix. |
| [Pen](./pen/)(const Color\&) | Erstellt ein neues [Pen](./)-Objekt, das die angegebene Farbe darstellt. |
| [Pen](./pen/)(const Color\&, float) | Erstellt ein neues [Pen](./)-Objekt, das die angegebene Farbe und Breite darstellt. |
| [Pen](./pen/)(const SharedPtr\<Brush\>\&) | Erstellt ein neues [Pen](./)-Objekt und initialisiert es mit dem angegebenen [Brush](../brush/)-Objekt. |
| [Pen](./pen/)(const SharedPtr\<Brush\>\&, float) | Erstellt ein neues [Pen](./)-Objekt und initialisiert es mit dem angegebenen [Brush](../brush/)-Objekt. |
| [ResetTransform](./resettransform/)() | Setzt die Transformationsmatrix des aktuellen Objekts zurück, sodass sie zu einer Einheitsmatrix wird. |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | Dreht die lokale geometrische Transformation um den angegebenen Winkel in der angegebenen Reihenfolge. |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | Skaliert die lokale geometrische Transformation um die angegebenen Faktoren in der angegebenen Reihenfolge. |
| [set_Alignment](./set_alignment/)(Drawing2D::PenAlignment) | Setzt die Ausrichtung des aktuellen [Pen](./)-Objekts. |
| [set_Brush](./set_brush/)(const SharedPtr\<Brush\>\&) | Setzt das [Brush](../brush/)-Objekt dieses Pen. |
| [set_Color](./set_color/)(const Color\&) | Setzt die Farbe dieses Pen. |
| [set_CompoundArray](./set_compoundarray/)(const System::ArrayPtr\<float\>\&) | Setzt ein Array von Werten, das einen zusammengesetzten Pen spezifiziert. |
| [set_CustomEndCap](./set_customendcap/)(const SharedPtr\<Drawing2D::CustomLineCap\>\&) | Setzt die benutzerdefinierte Endkappe der Linie. |
| [set_CustomStartCap](./set_customstartcap/)(const SharedPtr\<Drawing2D::CustomLineCap\>\&) | Setzt die benutzerdefinierte Startkappe der Linie. |
| [set_DashCap](./set_dashcap/)(Drawing2D::DashCap) | Setzt einen Wert, der die an beiden Enden einer gestrichelten Linie verwendete Kappe angibt. |
| [set_DashOffset](./set_dashoffset/)(float) | Setzt den Abstand vom Anfang einer Linie bis zum Beginn eines Strichmusters. |
| [set_DashPattern](./set_dashpattern/)(const System::ArrayPtr\<float\>\&) | Setzt ein Array, das ein benutzerdefiniertes Strichmuster in einer gestrichelten Linie angibt. Das Array besteht aus Zahlen, die die Längen von abwechselnden Strichen und Lücken spezifizieren. |
| [set_DashStyle](./set_dashstyle/)(Drawing2D::DashStyle) | Setzt einen Wert, der den Strichstil des aktuellen [Pen](./)-Objekts spezifiziert. |
| [set_EndCap](./set_endcap/)(Drawing2D::LineCap) | Setzt die Endkappe der Linie des aktuellen [Pen](./)-Objekts. |
| [set_LineJoin](./set_linejoin/)(Drawing2D::LineJoin) | Legt einen Wert fest, der bestimmt, wie die von diesem [Pen](./)-Objekt gezeichneten Linien verbunden werden. |
| [set_MiterLimit](./set_miterlimit/)(float) | Legt die Grenze für die Dicke der Verbindung an einer Gehrungsecke fest. |
| [set_StartCap](./set_startcap/)(Drawing2D::LineCap) | Legt die Startlinienkappe des aktuellen [Pen](./)-Objekts fest. |
| [set_Transform](./set_transform/)(const SharedPtr\<Drawing2D::Matrix\>\&) | Legt ein Matrix-Objekt fest, das die geometrischen Transformationen für den vom aktuellen Objekt dargestellten Pen angibt. |
| [set_Width](./set_width/)(float) | Legt die Breite des aktuellen [Pen](./)-Objekts fest. |
| [SetLineCap](./setlinecap/)(Drawing2D::LineCap, Drawing2D::LineCap, Drawing2D::DashCap) | NICHT IMPLEMENTIERT. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | Verschiebt die lokale geometrische Transformation um die angegebenen Dimensionen in der angegebenen Reihenfolge. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
