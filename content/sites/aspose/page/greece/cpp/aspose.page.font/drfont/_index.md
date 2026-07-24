---
title: "Aspose::Page::Font::DrFont κλάση"
linktitle: "DrFont"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::Font::DrFont κλάση. Χρησιμοποιήστε αυτή την κλάση αντί του GDI+ Font σε C++."
type: docs
weight: 100
url: /el/cpp/aspose.page.font/drfont/
---
## DrFont class


Χρησιμοποιήστε αυτή την κλάση αντί του GDI+ [Font](../).

```cpp
class DrFont : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Καθορίζει εάν το καθορισμένο [System::Object](../../system/object/), είναι ίσο με αυτή την παρουσία. |
| [get_AscentLis](./get_ascentlis/)() | Αναρρίφωση κελιού αυτής της γραμματοσειράς (lis). Αυτό είναι μια κάθετη απόσταση από την κορυφή του κελιού έως τη γραμμή βάσης του κελιού. |
| [get_AscentPoints](./get_ascentpoints/)() | Επιστρέφει την άνοδο του κελιού σε πόντους. |
| [get_CellHeightLis](./get_cellheightlis/)() | Επιστρέφει το ύψος του κελιού αυτής της γραμματοσειράς (lis). Αυτό είναι συντόμευση για [AscentLis](../) + [DescentLis](../). |
| [get_CellHeightPoints](./get_cellheightpoints/)() | Συντόμευση για [AscentPoints](../) + [DescentPoints](../). |
| [get_DescentLis](./get_descentlis/)() | Κατάβαση κελιού αυτής της γραμματοσειράς (lis). Αυτό είναι η κάθετη απόσταση από το κάτω μέρος του κελιού μέχρι τη γραμμή βάσης του κελιού. |
| [get_DescentPoints](./get_descentpoints/)() | Επιστρέφει την κατάβαση του κελιού σε πόντους. |
| [get_FamilyName](./get_familyname/)() | Λαμβάνει το όνομα αυτής της γραμματοσειράς. |
| [get_IsBold](./get_isbold/)() | Λαμβάνει μια τιμή που υποδεικνύει αν αυτή η παρουσία είναι έντονη. |
| [get_IsItalic](./get_isitalic/)() | Λαμβάνει μια τιμή που υποδεικνύει αν αυτή η παρουσία είναι πλάγια. |
| [get_LeadingLis](./get_leadinglis/)() | Επιστρέφει το leading αυτής της γραμματοσειράς (lis). Αυτό είναι συντόμευση για [LineSpacingLis](../) - [CellHeightLis](../). |
| [get_LeadingPoints](./get_leadingpoints/)() | Επιστρέφει το leading αυτής της γραμματοσειράς (lis). Αυτό είναι συντόμευση για [LineSpacingLis](../) - [CellHeightLis](../). |
| [get_LineSpacingLis](./get_linespacinglis/)() | Επιστρέφει το διάστημα κελιού αυτής της γραμματοσειράς (lis). Αυτό είναι η κάθετη απόσταση μεταξύ των γραμμών βάσης των δύο γλύφων. |
| [get_LineSpacingPoints](./get_linespacingpoints/)() | Επιστρέφει το διάστημα κελιού αυτής της γραμματοσειράς (πόντοι). Αυτό είναι η κάθετη απόσταση μεταξύ των γραμμών βάσης των δύο γλύφων. |
| [get_SizePoints](./get_sizepoints/)() | Λαμβάνει το μέγεθος αυτής της γραμματοσειράς (πόντοι). |
| [get_SmallCapsScaleFactor](./get_smallcapsscalefactor/)() | Λαμβάνει τα κεφαλαία της γραμματοσειράς. |
| [get_Style](./get_style/)() | Λαμβάνει τη γραμματοσειρά TrueType. |
| [get_StyleEx](./get_styleex/)() | Αυτή η ιδιότητα περιέχει πρόσθετες πληροφορίες σχετικά με το στυλ της γραμματοσειράς. |
| [GetCharWidthLis](./getcharwidthlis/)(char16_t) | Λαμβάνει το πλάτος χαρακτήρα lis. |
| [GetCharWidthPoints](./getcharwidthpoints/)(char16_t) | Επιστρέφει το πλάτος του χαρακτήρα (πόντοι). |
| [GetHashCode](./gethashcode/)() const override | Επιστρέφει έναν κωδικό κατακερματισμού για αυτήν την παρουσία. |
| [GetTextSizePoints](./gettextsizepoints/)(System::String) | Επιστρέφει το κουτί μέτρησης κειμένου του κειμένου σε πόντους. |
| [GetTextWidthLis](./gettextwidthlis/)(System::String) | Λαμβάνει το πλάτος κειμένου lis. |
| [GetTextWidthPoints](./gettextwidthpoints/)(System::String) | Λαμβάνει το πλάτος κειμένου σε πόντους. |
| [GetTextWidthPoints](./gettextwidthpoints/)(System::String, int32_t, int32_t) | Λαμβάνει το πλάτος κειμένου σε πόντους. |
| static [IsPoorlyRenderedByGdiPlus](./ispoorlyrenderedbygdiplus/)(System::String) | Επιστρέφει True για τη γραμματοσειρά "Microsoft Sans Serif". Αυτή αποδίδεται κακά από το GDI+. Δείτε Test286 και Gemini-6959. |
| [Replace](./replace/)(System::SharedPtr\<DrFont\>) | Αντικαταστήστε το περιεχόμενο της γραμματοσειράς. |
| [set_SizePoints](./set_sizepoints/)(float) | Λαμβάνει το μέγεθος αυτής της γραμματοσειράς (πόντοι). |
| [set_StyleEx](./set_styleex/)(int16_t) | Αυτή η ιδιότητα περιέχει πρόσθετες πληροφορίες σχετικά με το στυλ της γραμματοσειράς. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Font](../)
* Library [Aspose.Page for C++](../../)
