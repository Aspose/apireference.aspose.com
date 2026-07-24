---
title: "Aspose::Page::XPS::XpsModel::XpsCanvas Klasse"
linktitle: "XpsCanvas"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::XpsModel::XpsCanvas Klasse. Klasse, die Canvas-Elementfunktionen kapselt. Dieses Element gruppiert Elemente zusammen. Zum Beispiel können Glyphs- und Path-Elemente in einem Canvas gruppiert werden, um als Einheit (als Hyperlink-Ziel) identifiziert zu werden oder um einen zusammengesetzten Eigenschaftswert auf jedes Kind- und Vorfahrenelement in C++ anzuwenden."
type: docs
weight: 500
url: /de/cpp/aspose.page.xps.xpsmodel/xpscanvas/
---
## XpsCanvas class


Klasse, die Canvas-Elementeigenschaften kapselt. Dieses Element gruppiert Elemente zusammen. Beispielsweise können Glyphs- und Path-Elemente in einem Canvas gruppiert werden, um als Einheit (als Hyperlink-Ziel) identifiziert zu werden oder um einen zusammengesetzten Eigenschaftswert auf jedes Kind- und Elternelement anzuwenden.

```cpp
class XpsCanvas : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(T) | Fügt ein Element zur Kindliste dieses Canvas hinzu. |
| [AddCanvas](./addcanvas/)() | Fügt ein neues Canvas zur Kindliste dieses Canvas hinzu. |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Fügt neue Glyphs zur Kindliste dieses Canvas hinzu. |
| [AddPath](./addpath/)(System::SharedPtr\<XpsPathGeometry\>) | Fügt einen neuen Path zur Kindliste dieses Canvas hinzu. |
| [Clone](./clone/)() | Klont dieses Canvas. |
| [get_EdgeMode](./get_edgemode/)() const | Gibt den Wert zurück bzw. setzt ihn, der steuert, wie die Kanten von Pfaden innerhalb des Canvas gerendert werden. |
| [Insert](./insert/)(int32_t, T) | Fügt ein Element an der Position *index* in die Kindliste dieses Canvas ein. |
| [InsertCanvas](./insertcanvas/)(int32_t) | Fügt ein neues Canvas an der Position *index* in die Kindliste dieses Canvas ein. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | Fügt neue Glyphs an der Position *index* in die Kindliste dieses Canvas ein. |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsPathGeometry\>) | Fügt einen neuen Path an der Position *index* in die Kindliste dieses Canvas ein. |
| [set_EdgeMode](./set_edgemode/)(XpsEdgeMode) | Gibt den Wert zurück bzw. setzt ihn, der steuert, wie die Kanten von Pfaden innerhalb des Canvas gerendert werden. |
## Siehe auch

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
