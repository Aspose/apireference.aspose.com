---
title: "Aspose::Page::XPS::XpsModel::XpsPathGeometry κλάση"
linktitle: "XpsPathGeometry"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::XPS::XpsModel::XpsPathGeometry κλάση. Κλάση που ενσωματώνει χαρακτηριστικά στοιχείου ιδιότητας PathGeometry. Αυτό το στοιχείο περιέχει ένα σύνολο σχημάτων διαδρομής που καθορίζονται είτε με το χαρακτηριστικό Figures είτε με ένα θυγατρικό στοιχείο PathFigure σε C++."
type: docs
weight: 3200
url: /el/cpp/aspose.page.xps.xpsmodel/xpspathgeometry/
---
## XpsPathGeometry class


Κλάση που ενσωματώνει χαρακτηριστικά του στοιχείου ιδιότητας PathGeometry. Αυτό το στοιχείο περιέχει ένα σύνολο μορφών διαδρομής που καθορίζονται είτε με το χαρακτηριστικό Figures είτε με ένα παιδικό στοιχείο PathFigure.

```cpp
class XpsPathGeometry : public Aspose::Page::XPS::XpsModel::XpsArray<System::SharedPtr<XpsPathFigure>>,
                        public Aspose::Page::XPS::XpsModel::ITransformableProperty
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [AddSegment](./addsegment/)(System::SharedPtr\<XpsPathSegment\>) | Προσθέτει ένα τμήμα διαδρομής στη λίστα των θυγατρικών τμημάτων του τελευταίου σχήματος διαδρομής. |
| [Clone](./clone/)() | Δημιουργεί αντίγραφο αυτής της γεωμετρίας διαδρομής. |
| [get_FillRule](./get_fillrule/)() const | Επιστρέφει/ορίζει την τιμή που καθορίζει πώς οι διασταυρούμενες περιοχές γεωμετρικών σχημάτων συνδυάζονται για να σχηματίσουν μια περιοχή. |
| [get_PathFigures](./get_pathfigures/)() | Επιστρέφει τη λίστα των θυγατρικών σχημάτων διαδρομής. |
| [get_Transform](./get_transform/)() override | Επιστρέφει/ορίζει τον αφινικό πίνακα μετασχηματισμού που καθιερώνει τον τοπικό μετασχηματισμό πίνακα που εφαρμόζεται σε όλα τα θυγατρικά και απογόνους στοιχεία της γεωμετρίας διαδρομής πριν χρησιμοποιηθεί για γέμισμα, αποκοπή ή σχεδίαση. |
| [InsertSegment](./insertsegment/)(int32_t, System::SharedPtr\<XpsPathSegment\>) | Εισάγει ένα τμήμα διαδρομής στη λίστα των θυγατρικών τμημάτων του τελευταίου σχήματος διαδρομής στη θέση *index*. |
| [RemoveSegment](./removesegment/)(System::SharedPtr\<XpsPathSegment\>) | Αφαιρεί ένα τμήμα διαδρομής από τη λίστα των θυγατρικών τμημάτων του τελευταίου σχήματος διαδρομής. |
| [RemoveSegmentAt](./removesegmentat/)(int32_t) | Αφαιρεί ένα τμήμα διαδρομής από τη λίστα των θυγατρικών τμημάτων του τελευταίου σχήματος διαδρομής στη θέση *index*. |
| [set_FillRule](./set_fillrule/)(XpsFillRule) | Επιστρέφει/ορίζει την τιμή που καθορίζει πώς οι διασταυρούμενες περιοχές γεωμετρικών σχημάτων συνδυάζονται για να σχηματίσουν μια περιοχή. |
| [set_Transform](./set_transform/)(System::SharedPtr\<XpsMatrix\>) override | Επιστρέφει/ορίζει τον αφινικό πίνακα μετασχηματισμού που καθιερώνει τον τοπικό μετασχηματισμό πίνακα που εφαρμόζεται σε όλα τα θυγατρικά και απογόνους στοιχεία της γεωμετρίας διαδρομής πριν χρησιμοποιηθεί για γέμισμα, αποκοπή ή σχεδίαση. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Ορίστε το n'th όρισμα προτύπου ως αδύναμο δείκτη (αντί για κοινόχρηστο). Επιτρέπει την εναλλαγή δεικτών σε containers σε αδύναμη λειτουργία. |
## Δείτε επίσης

* Class [XpsArray](../xpsarray/)
* Class [ITransformableProperty](../itransformableproperty/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
