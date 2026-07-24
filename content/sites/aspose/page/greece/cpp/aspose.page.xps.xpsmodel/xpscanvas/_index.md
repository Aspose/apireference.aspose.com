---
title: "Aspose::Page::XPS::XpsModel::XpsCanvas κλάση"
linktitle: "XpsCanvas"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::XPS::XpsModel::XpsCanvas κλάση. Κλάση που ενσωματώνει τις δυνατότητες του στοιχείου Canvas. Αυτό το στοιχείο ομαδοποιεί στοιχεία μαζί. Για παράδειγμα, τα στοιχεία Glyphs και Path μπορούν να ομαδοποιηθούν σε ένα canvas ώστε να ταυτοποιηθούν ως μονάδα (ως προορισμός υπερσυνδέσμου) ή για να εφαρμοστεί μια σύνθετη τιμή ιδιότητας σε κάθε παιδί και προγενέστερο στοιχείο σε C++."
type: docs
weight: 500
url: /el/cpp/aspose.page.xps.xpsmodel/xpscanvas/
---
## XpsCanvas class


Κλάση που ενσωματώνει χαρακτηριστικά του στοιχείου Canvas. Αυτό το στοιχείο ομαδοποιεί στοιχεία μαζί. Για παράδειγμα, τα στοιχεία Glyphs και Path μπορούν να ομαδοποιηθούν σε ένα canvas ώστε να αναγνωρίζονται ως μονάδα (ως προορισμός υπερσυνδέσμου) ή για να εφαρμοστεί μια σύνθετη τιμή ιδιότητας σε κάθε παιδί και προγονικό στοιχείο.

```cpp
class XpsCanvas : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Add](./add/)(T) | Προσθέτει ένα στοιχείο στη λίστα παιδιών αυτού του canvas. |
| [AddCanvas](./addcanvas/)() | Προσθέτει ένα νέο canvas στη λίστα παιδιών αυτού του canvas. |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Προσθέτει νέα glyphs στη λίστα παιδιών αυτού του canvas. |
| [AddPath](./addpath/)(System::SharedPtr\<XpsPathGeometry\>) | Προσθέτει ένα νέο path στη λίστα παιδιών αυτού του canvas. |
| [Clone](./clone/)() | Κλωνοποιεί αυτό το canvas. |
| [get_EdgeMode](./get_edgemode/)() const | Επιστρέφει/ορίζει την τιμή που ελέγχει πώς αποδίδονται οι άκρες των paths μέσα στο canvas. |
| [Insert](./insert/)(int32_t, T) | Εισάγει ένα στοιχείο στη λίστα παιδιών αυτού του canvas στη θέση *index*. |
| [InsertCanvas](./insertcanvas/)(int32_t) | Εισάγει ένα νέο canvas στη λίστα παιδιών αυτού του canvas στη θέση *index*. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | Εισάγει νέα glyphs στη λίστα παιδιών αυτού του canvas στη θέση *index*. |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsPathGeometry\>) | Εισάγει ένα νέο path στη λίστα παιδιών αυτού του canvas στη θέση *index*. |
| [set_EdgeMode](./set_edgemode/)(XpsEdgeMode) | Επιστρέφει/ορίζει την τιμή που ελέγχει πώς αποδίδονται οι άκρες των paths μέσα στο canvas. |
## Δείτε επίσης

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
