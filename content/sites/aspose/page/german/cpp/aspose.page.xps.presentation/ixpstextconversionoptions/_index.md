---
title: "Aspose::Page::XPS::Presentation::IXpsTextConversionOptions class"
linktitle: "IXpsTextConversionOptions"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::Presentation::IXpsTextConversionOptions class. Definiert Optionen für die Konvertierung von XPS in andere Formate in C++."
type: docs
weight: 300
url: /de/cpp/aspose.page.xps.presentation/ixpstextconversionoptions/
---
## IXpsTextConversionOptions class


Definiert Optionen für die Konvertierung von [XPS](../../aspose.page.xps/) in andere Formate.

```cpp
class IXpsTextConversionOptions : public virtual System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [get_PreserveText](./get_preservetext/)() | In [XPS](../../aspose.page.xps/), können einige Textelemente Verweise auf alternative Glyphenformen enthalten, die keinem Zeichencode in der Schrift entsprechen. Wenn dieses Flag auf true gesetzt ist, wird der Text solcher [XPS](../../aspose.page.xps/)‑Elemente in grafische Formen konvertiert. Dann erscheint der Text selbst transparent darüber. Dadurch bleibt der Text dieser Elemente auswählbar. Der Nebeneffekt ist jedoch, dass die Ausgabedatei viel größer sein kann als das Original. Wenn das Flag auf false gesetzt ist, werden die Zeichen, die als alternative Formen angezeigt werden sollen, durch andere Zeichen ersetzt, die den alternativen Glyphenformen zugeordnet werden. Daher wird der Text, obwohl weiterhin auswählbar, modifiziert und wahrscheinlich unlesbar. |
| virtual [set_PreserveText](./set_preservetext/)(bool) | In [XPS](../../aspose.page.xps/), können einige Textelemente Verweise auf alternative Glyphenformen enthalten, die keinem Zeichencode in der Schrift entsprechen. Wenn dieses Flag auf true gesetzt ist, wird der Text solcher [XPS](../../aspose.page.xps/)‑Elemente in grafische Formen konvertiert. Dann erscheint der Text selbst transparent darüber. Dadurch bleibt der Text dieser Elemente auswählbar. Der Nebeneffekt ist jedoch, dass die Ausgabedatei viel größer sein kann als das Original. Wenn das Flag auf false gesetzt ist, werden die Zeichen, die als alternative Formen angezeigt werden sollen, durch andere Zeichen ersetzt, die den alternativen Glyphenformen zugeordnet werden. Daher wird der Text, obwohl weiterhin auswählbar, modifiziert und wahrscheinlich unlesbar. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Presentation](../)
* Library [Aspose.Page for C++](../../)
