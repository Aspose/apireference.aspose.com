---
title: "System::Drawing::Graphics::MeasureString μέθοδος"
linktitle: "MeasureString"
second_title: "Aspose.Page για C++"
description: "System::Drawing::Graphics::MeasureString μέθοδος. Επιστρέφει ένα μέγεθος της καθορισμένης συμβολοσειράς όταν σχεδιάζεται με τη καθορισμένη γραμματοσειρά στη καθορισμένη μορφή στην C++."
type: docs
weight: 6500
url: /el/cpp/system.drawing/graphics/measurestring/
---
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, int, System::SharedPtr\<StringFormat\> const\&) const method


Επιστρέφει το μέγεθος της καθορισμένης συμβολοσειράς όταν σχεδιάζεται με τη καθορισμένη γραμματοσειρά στην καθορισμένη μορφή.

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, int width, System::SharedPtr<StringFormat> const &stringFormat=nullptr) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| str | String const\& | Η συμβολοσειρά της οποίας το μέγεθος πρέπει να υπολογιστεί |
| γραμματοσειρά | System::SharedPtr\<Font\> const\& | Η γραμματοσειρά που χρησιμοποιείται για τη σχεδίαση της συμβολοσειράς |
| πλάτος | int | Το μέγιστο πλάτος της συμβολοσειράς |
| stringFormat | System::SharedPtr\<StringFormat\> const\& | Καθορίζει τη μορφή της συμβολοσειράς |

### ReturnValue

Ένα αντικείμενο [SizeF](../../sizef/) που αντιπροσωπεύει το μέγεθος της συμβολοσειράς στις μονάδες μέτρησης που καθορίζονται από την ιδιότητα PageUnit του τρέχοντος αντικειμένου Graphics.

## Δείτε επίσης

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, PointF const\&, System::SharedPtr\<StringFormat\> const\&) const method


Επιστρέφει το μέγεθος της καθορισμένης συμβολοσειράς όταν σχεδιάζεται με τη καθορισμένη γραμματοσειρά στην καθορισμένη μορφή.

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, PointF const &origin=PointF(0, 0), System::SharedPtr<StringFormat> const &stringFormat=nullptr) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| str | String const\& | Η συμβολοσειρά της οποίας το μέγεθος πρέπει να υπολογιστεί |
| γραμματοσειρά | System::SharedPtr\<Font\> const\& | Η γραμματοσειρά που χρησιμοποιείται για τη σχεδίαση της συμβολοσειράς |
| origin | PointF const\& | Καθορίζει τη θέση της επάνω αριστερής γωνίας της συμβολοσειράς |
| stringFormat | System::SharedPtr\<StringFormat\> const\& | Καθορίζει τη μορφή της συμβολοσειράς |

### ReturnValue

Ένα αντικείμενο [SizeF](../../sizef/) που αντιπροσωπεύει το μέγεθος της συμβολοσειράς στις μονάδες μέτρησης που καθορίζονται από την ιδιότητα PageUnit του τρέχοντος αντικειμένου Graphics.

## Δείτε επίσης

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [PointF](../../pointf/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&, int\&, int\&) const method


ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ.

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, SizeF const &layoutArea, System::SharedPtr<StringFormat> const &stringFormat, int &charactersFitted, int &linesFilled) const
```


## Δείτε επίσης

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&) const method


Επιστρέφει το μέγεθος της καθορισμένης συμβολοσειράς όταν σχεδιάζεται με τη καθορισμένη γραμματοσειρά στην καθορισμένη μορφή.

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, SizeF const &layoutArea, System::SharedPtr<StringFormat> const &stringFormat=nullptr) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| str | String const\& | Η συμβολοσειρά της οποίας το μέγεθος πρέπει να υπολογιστεί |
| γραμματοσειρά | System::SharedPtr\<Font\> const\& | Η γραμματοσειρά που χρησιμοποιείται για τη σχεδίαση της συμβολοσειράς |
| περιοχήΔιάταξης | SizeF const\& | Η μέγιστη περιοχή διάταξης της συμβολοσειράς |
| stringFormat | System::SharedPtr\<StringFormat\> const\& | Καθορίζει τη μορφή της συμβολοσειράς |

### ReturnValue

Ένα αντικείμενο [SizeF](../../sizef/) που αντιπροσωπεύει το μέγεθος της συμβολοσειράς στις μονάδες μέτρησης που καθορίζονται από την ιδιότητα PageUnit του τρέχοντος αντικειμένου Graphics.

## Δείτε επίσης

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
