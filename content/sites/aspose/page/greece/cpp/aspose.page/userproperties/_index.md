---
title: "Aspose::Page::UserProperties κλάση"
linktitle: "UserProperties"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::UserProperties κλάση. Ειδική κλάση ιδιοτήτων που επιτρέπει τον ορισμό και την επιστροφή τυποποιημένων ιδιοτήτων. Επιτρέπει επίσης τη σύνδεση δύο προεπιλεγμένων αντικειμένων ιδιοτήτων για αναζήτηση εάν αυτό το αντικείμενο ιδιότητας δεν περιέχει την ιδιότητα σε C++."
type: docs
weight: 1600
url: /el/cpp/aspose.page/userproperties/
---
## UserProperties class


Ειδική κλάση ιδιοτήτων που επιτρέπει τον ορισμό και την επιστροφή τυποποιημένων ιδιοτήτων. Επιτρέπει επίσης τη σύνδεση δύο προεπιλεγμένων αντικειμένων ιδιοτήτων για αναζήτηση εάν αυτό το αντικείμενο ιδιοτήτων δεν περιέχει την ιδιότητα.

```cpp
class UserProperties : public System::Collections::Generic::Dictionary<System::String, System::SharedPtr<System::Object>>
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [GetProperty](./getproperty/)(System::String) | Λαμβάνει τιμή ιδιότητας string. |
| virtual [GetProperty](./getproperty/)(System::String, System::String) | Λαμβάνει τιμή ιδιότητας string. Εάν η ζητούμενη ιδιότητα λείπει, επιστρέφει την προεπιλεγμένη τιμή που παρέχεται. |
| virtual [GetPropertyColor](./getpropertycolor/)(System::String) | Λαμβάνει τιμή ιδιότητας color. |
| virtual [GetPropertyColor](./getpropertycolor/)(System::String, System::Drawing::Color) | Λαμβάνει τιμή ιδιότητας color. Εάν η ζητούμενη ιδιότητα λείπει, επιστρέφει την προεπιλεγμένη τιμή που παρέχεται. |
| virtual [GetPropertyDouble](./getpropertydouble/)(System::String) | Λαμβάνει τιμή ιδιότητας double. |
| virtual [GetPropertyDouble](./getpropertydouble/)(System::String, double) | Λαμβάνει τιμή ιδιότητας double. Εάν η ζητούμενη ιδιότητα λείπει, επιστρέφει την προεπιλεγμένη τιμή που παρέχεται. |
| virtual [GetPropertyFloat](./getpropertyfloat/)(System::String) | Λαμβάνει τιμή ιδιότητας float. |
| virtual [GetPropertyFloat](./getpropertyfloat/)(System::String, float) | Λαμβάνει τιμή ιδιότητας float. Εάν η ζητούμενη ιδιότητα λείπει, επιστρέφει την προεπιλεγμένη τιμή που παρέχεται. |
| virtual [GetPropertyInt](./getpropertyint/)(System::String) | Λαμβάνει τιμή ιδιότητας integer. |
| virtual [GetPropertyInt](./getpropertyint/)(System::String, int32_t) | Λαμβάνει τιμή ιδιότητας integer. Εάν η ζητούμενη ιδιότητα λείπει, επιστρέφει την προεπιλεγμένη τιμή που παρέχεται. |
| virtual [GetPropertyMargins](./getpropertymargins/)(System::String) | Λαμβάνει τιμή ιδιότητας margins. |
| virtual [GetPropertyMargins](./getpropertymargins/)(System::String, System::SharedPtr\<Margins\>) | Λαμβάνει τιμή ιδιότητας margins. Εάν η ζητούμενη ιδιότητα λείπει, επιστρέφει την προεπιλεγμένη τιμή που παρέχεται. |
| virtual [GetPropertyMatrix](./getpropertymatrix/)(System::String) | Λαμβάνει τιμή ιδιότητας matrix. |
| virtual [GetPropertyMatrix](./getpropertymatrix/)(System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Λαμβάνει τιμή ιδιότητας matrix. Εάν η ζητούμενη ιδιότητα λείπει, επιστρέφει την προεπιλεγμένη τιμή που παρέχεται. |
| virtual [GetPropertyRectangle](./getpropertyrectangle/)(System::String) | Λαμβάνει τιμή ιδιότητας rectangle. |
| virtual [GetPropertyRectangle](./getpropertyrectangle/)(System::String, System::Drawing::RectangleF) | Λαμβάνει τιμή ιδιότητας rectangle. Εάν η ζητούμενη ιδιότητα λείπει, επιστρέφει την προεπιλεγμένη τιμή που παρέχεται. |
| virtual [GetPropertySize](./getpropertysize/)(System::String) | Λαμβάνει τιμή ιδιότητας size. |
| virtual [GetPropertySize](./getpropertysize/)(System::String, System::Drawing::Size) | Λαμβάνει τιμή ιδιότητας size. Εάν η ζητούμενη ιδιότητα λείπει, επιστρέφει την προεπιλεγμένη τιμή που παρέχεται. |
| virtual [GetPropertyStringArray](./getpropertystringarray/)(System::String) | Λαμβάνει τιμή ιδιότητας string array. |
| virtual [GetPropertyStringArray](./getpropertystringarray/)(System::String, System::ArrayPtr\<System::String\>) | Λαμβάνει τιμή ιδιότητας string array. Εάν η ζητούμενη ιδιότητα λείπει, επιστρέφει την προεπιλεγμένη τιμή που παρέχεται. |
| virtual [IsProperty](./isproperty/)(System::String) | Λαμβάνει τιμή ιδιότητας boolean. |
| virtual [IsProperty](./isproperty/)(System::String, bool) | Λαμβάνει τιμή ιδιότητας boolean. Εάν η ζητούμενη ιδιότητα λείπει, επιστρέφει την προεπιλεγμένη τιμή που παρέχεται. |
| virtual [PrintProperties](./printproperties/)() |  |
| virtual [PropertyNames](./propertynames/)() | Επιστρέφει τα ονόματα των ιδιοτήτων. |
| virtual [set_Properties](./set_properties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Αντιγράφει τις ιδιότητες, συμπεριλαμβανομένων των προεπιλογών τους, σε αυτό το [UserProperties](./). |
| virtual [SetProperty](./setproperty/)(System::String, System::String) | Ορίζει τιμή ιδιότητας string. |
| virtual [SetProperty](./setproperty/)(System::String, System::ArrayPtr\<System::String\>) | Ορίζει την τιμή της ιδιότητας πίνακα συμβολοσειρών. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::ArrayPtr\<System::String\>) | Ορίζει την τιμή της ιδιότητας πίνακα συμβολοσειρών στον καθορισμένο πίνακα ιδιοτήτων. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Color) | Ορίζει την τιμή της ιδιότητας χρώματος. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Color) | Ορίζει την τιμή της ιδιότητας χρώματος στον καθορισμένο πίνακα ιδιοτήτων. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Rectangle) | Ορίζει την τιμή της ιδιότητας ορθογωνίου. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Rectangle) | Ορίζει την τιμή της ιδιότητας ορθογωνίου στον καθορισμένο πίνακα ιδιοτήτων. |
| virtual [SetProperty](./setproperty/)(System::String, System::SharedPtr\<Margins\>) | Ορίζει την τιμή της ιδιότητας περιθωρίων. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::SharedPtr\<Margins\>) | Ορίζει την τιμή της ιδιότητας περιθωρίων στον καθορισμένο πίνακα ιδιοτήτων. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Size) | Ορίζει την τιμή της ιδιότητας μεγέθους. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Size) | Ορίζει την τιμή της ιδιότητας μεγέθους στον καθορισμένο πίνακα ιδιοτήτων. |
| virtual [SetProperty](./setproperty/)(System::String, int32_t) | Ορίζει την τιμή της ιδιότητας ακέραιου. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, int32_t) | Ορίζει την τιμή της ιδιότητας ακέραιου στον καθορισμένο πίνακα ιδιοτήτων. |
| virtual [SetProperty](./setproperty/)(System::String, double) | Ορίζει την τιμή της ιδιότητας διπλού. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, double) | Ορίζει την τιμή της ιδιότητας διπλού στον καθορισμένο πίνακα ιδιοτήτων. |
| virtual [SetProperty](./setproperty/)(System::String, float) | Ορίζει την τιμή της ιδιότητας float. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, float) | Ορίζει την τιμή της ιδιότητας float στον καθορισμένο πίνακα ιδιοτήτων. |
| virtual [SetProperty](./setproperty/)(System::String, bool) | Ορίζει την τιμή της ιδιότητας boolean. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, bool) | Ορίζει την τιμή της ιδιότητας boolean στον καθορισμένο πίνακα ιδιοτήτων. |
| virtual [SetProperty](./setproperty/)(System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Ορίζει την τιμή της ιδιότητας matrix. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Ορίζει την τιμή της ιδιότητας matrix στον καθορισμένο πίνακα ιδιοτήτων. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Ορίστε το n'th όρισμα προτύπου ως αδύναμο δείκτη (αντί για κοινόχρηστο). Επιτρέπει την εναλλαγή δεικτών σε containers σε αδύναμη λειτουργία. |
| [UserProperties](./userproperties/)() | Αρχικοποιεί ένα κενό παράδειγμα της κλάσης [UserProperties](./). |
| [UserProperties](./userproperties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Αρχικοποιεί ένα παράδειγμα της κλάσης [UserProperties](./) με προεπιλεγμένες τιμές. |
| [UserProperties](./userproperties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Δημιουργεί το [UserProperties](./) με πίνακα defaults και altDefaults, που αναζητούνται με αυτή τη σειρά. |
## Δείτε επίσης

* Class [Dictionary](../../system.collections.generic/dictionary/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
