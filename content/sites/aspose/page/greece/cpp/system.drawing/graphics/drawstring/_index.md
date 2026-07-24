---
title: "System::Drawing::Graphics::DrawString μέθοδος"
linktitle: "DrawString"
second_title: "Aspose.Page για C++"
description: "System::Drawing::Graphics::DrawString μέθοδος. Σχεδιάζει τη συγκεκριμένη συμβολοσειρά στην καθορισμένη θέση χρησιμοποιώντας τη συγκεκριμένη γραμματοσειρά και Brush σε C++."
type: docs
weight: 2800
url: /el/cpp/system.drawing/graphics/drawstring/
---
## Graphics::DrawString(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, float, float, const System::SharedPtr\<System::Drawing::StringFormat\>\&) method


Σχεδιάζει το καθορισμένο κείμενο στην καθορισμένη θέση χρησιμοποιώντας τη καθορισμένη γραμματοσειρά και το πινέλο.

```cpp
void System::Drawing::Graphics::DrawString(const String &str, const SharedPtr<Font> &font, const SharedPtr<Brush> &brush, float x, float y, const System::SharedPtr<System::Drawing::StringFormat> &stringFormat=nullptr)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| str | const String\& | Η συμβολοσειρά προς σχεδίαση |
| γραμματοσειρά | const SharedPtr\<Font\>\& | Μια γραμματοσειρά για χρήση |
| brush | const SharedPtr\<Brush\>\& | Ένα αντικείμενο [Brush](../../brush/) για χρήση στη σχεδίαση |
| x | float | Η συντεταγμένη X της θέσης της επάνω αριστερής γωνίας της σχεδιασμένης συμβολοσειράς |
| y | float | Η συντεταγμένη Y της θέσης της επάνω αριστερής γωνίας της σχεδιασμένης συμβολοσειράς |
| stringFormat | const System::SharedPtr\<System::Drawing::StringFormat\>\& | Καθορίστηκε η μορφή της συμβολοσειράς |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [Brush](../../brush/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::DrawString(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, PointF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) method


Σχεδιάζει το καθορισμένο κείμενο στην καθορισμένη θέση χρησιμοποιώντας τη καθορισμένη γραμματοσειρά και το πινέλο.

```cpp
void System::Drawing::Graphics::DrawString(const String &str, const SharedPtr<Font> &font, const SharedPtr<Brush> &brush, PointF topLeft, const System::SharedPtr<System::Drawing::StringFormat> &stringFormat=nullptr)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| str | const String\& | Η συμβολοσειρά προς σχεδίαση |
| γραμματοσειρά | const SharedPtr\<Font\>\& | Μια γραμματοσειρά για χρήση |
| brush | const SharedPtr\<Brush\>\& | Ένα αντικείμενο [Brush](../../brush/) για χρήση στη σχεδίαση |
| topLeft | PointF | Καθορίζει τη θέση της επάνω αριστερής γωνίας της σχεδιασμένης συμβολοσειράς |
| stringFormat | const System::SharedPtr\<System::Drawing::StringFormat\>\& | Καθορίστηκε η μορφή της συμβολοσειράς |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [Brush](../../brush/)
* Class [PointF](../../pointf/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::DrawString(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, RectangleF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) method


Σχεδιάζει τη συγκεκριμένη συμβολοσειρά στο συγκεκριμένο ορθογώνιο χρησιμοποιώντας τη συγκεκριμένη γραμματοσειρά και πινέλο.

```cpp
void System::Drawing::Graphics::DrawString(const String &str, const SharedPtr<Font> &font, const SharedPtr<Brush> &brush, RectangleF layoutRectangle, const System::SharedPtr<System::Drawing::StringFormat> &stringFormat=nullptr)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| str | const String\& | Η συμβολοσειρά προς σχεδίαση |
| γραμματοσειρά | const SharedPtr\<Font\>\& | Μια γραμματοσειρά για χρήση |
| brush | const SharedPtr\<Brush\>\& | Ένα αντικείμενο [Brush](../../brush/) για χρήση στη σχεδίαση |
| layoutRectangle | RectangleF | Καθορίζει ένα ορθογώνιο για τη σχεδίαση της συμβολοσειράς |
| stringFormat | const System::SharedPtr\<System::Drawing::StringFormat\>\& | Καθορίστηκε η μορφή της συμβολοσειράς |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [Brush](../../brush/)
* Class [RectangleF](../../rectanglef/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
