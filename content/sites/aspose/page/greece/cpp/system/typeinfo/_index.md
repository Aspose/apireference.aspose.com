---
title: "System::TypeInfo κλάση"
linktitle: "TypeInfo"
second_title: "Aspose.Page για C++"
description: "System::TypeInfo κλάση. Αντιπροσωπεύει έναν συγκεκριμένο τύπο και παρέχει πληροφορίες γι' αυτό σε C++."
type: docs
weight: 6600
url: /el/cpp/system/typeinfo/
---
## TypeInfo class


Αντιπροσωπεύει έναν συγκεκριμένο τύπο και παρέχει πληροφορίες γι' αυτό.

```cpp
class TypeInfo
```

## Nested classes

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [AddAttribute](./addattribute/)(const ObjectPtr\&) | Προσθέτει το καθορισμένο χαρακτηριστικό στη λίστα των χαρακτηριστικών του τύπου. |
| [AddDefaultConstructor](./adddefaultconstructor/)() | Ορίζει τον προεπιλεγμένο κατασκευαστή για τον τύπο T. |
| [AddDefaultConstructor](./adddefaultconstructor/)(DefaultConstructor) | Ορίζει τον προεπιλεγμένο κατασκευαστή μέσω του functor που δημιουργεί την παρουσία της κλάσης. |
| [AddMember](./addmember/)(const SharedPtr\<System::Reflection::MemberInfo\>\&) | Προσθέτει το καθορισμένο μέλος στη λίστα των μελών του τύπου. |
| static [BoxedValueType](./boxedvaluetype/)() | Παρέχει μοναδική δομή [TypeInfo](./) για τον τύπο [BoxedValue](./boxedvalue/) ώστε να μοιράζεται από πολλαπλές κλάσεις Boxed*. |
| [Equals](./equals/)(const TypeInfo\&) const |  |
| [get_Assembly](./get_assembly/)() const | ΔΕΝ ΥΛΟΠΟΙΕΙΤΑΙ. Επιστρέφει έναν δείκτη στη συναρμολόγηση στην οποία δηλώνεται ο τύπος που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [get_AssemblyQualifiedName](./get_assemblyqualifiedname/)() const | ΔΕΝ ΥΛΟΠΟΙΕΙΤΑΙ. Επιστρέφει το πλήρες όνομα, συμπεριλαμβανομένου του ονόματος της συναρμολόγησης, του τύπου που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [get_BaseType](./get_basetype/)() const | Επιστρέφει τον περιγραφέα του βασικού τύπου. |
| [get_ContainsGenericParameters](./get_containsgenericparameters/)() const | Λαμβάνει μια τιμή που υποδεικνύει εάν το τρέχον αντικείμενο Type έχει παραμέτρους τύπου που δεν έχουν αντικατασταθεί από συγκεκριμένους τύπους. |
| [get_DeclaredMember](./get_declaredmember/)(const String\&) const | Λαμβάνει τη λίστα των μελών με το καθορισμένο όνομα. |
| [get_FullName](./get_fullname/)() const | Επιστρέφει το πλήρως προσδιορισμένο όνομα (αλλά χωρίς το όνομα του assembly) του τύπου που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [get_GenericTypeArguments](./get_generictypearguments/)() const | Λαμβάνει έναν πίνακα των γενικών τύπων ορισμάτων για αυτόν τον τύπο. |
| [get_IsAbstract](./get_isabstract/)() const | Λαμβάνει μια τιμή που υποδεικνύει εάν ο Type είναι αφηρημένος και πρέπει να παρακαμφθεί. |
| [get_IsArray](./get_isarray/)() const | Λαμβάνει μια τιμή που υποδεικνύει εάν ο τύπος είναι πίνακας. |
| [get_IsClass](./get_isclass/)() const | Λαμβάνει μια τιμή που υποδεικνύει εάν ο Type είναι κλάση ή delegate· δηλαδή, όχι τύπος τιμής ή διεπαφή. |
| [get_IsEnum](./get_isenum/)() const | Λαμβάνει μια τιμή που υποδεικνύει εάν ο τρέχων Type αντιπροσωπεύει μια απαρίθμηση. |
| [get_IsGenericType](./get_isgenerictype/)() const |  |
| [get_IsGenericTypeDefinition](./get_isgenerictypedefinition/)() const | Λαμβάνει μια τιμή που υποδεικνύει εάν ο τρέχων Type αντιπροσωπεύει έναν ορισμό γενικού τύπου, από τον οποίο μπορούν να κατασκευαστούν άλλοι γενικοί τύποι. |
| [get_IsInterface](./get_isinterface/)() const | Λαμβάνει μια τιμή που υποδεικνύει εάν ο Type είναι διεπαφή· δηλαδή, όχι κλάση ή τύπος τιμής. |
| [get_IsSealed](./get_issealed/)() const | Λαμβάνει μια τιμή που υποδεικνύει εάν ο Type δηλώνεται sealed. |
| [get_IsValueType](./get_isvaluetype/)() const | Λαμβάνει μια τιμή που υποδεικνύει εάν ο Type είναι τύπος τιμής. |
| [get_IsVisible](./get_isvisible/)() const | Λαμβάνει μια τιμή που υποδεικνύει εάν ο Type μπορεί να προσπελαστεί από κώδικα εκτός του assembly. |
| [get_Name](./get_name/)() const | Επιστρέφει το όνομα του τύπου που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [get_Namespace](./get_namespace/)() const | Λαμβάνει το namespace του Type. |
| [GetConstructor](./getconstructor/)(const ArrayPtr\<TypeInfo\>\&) const | Αναζητά έναν δημόσιο κατασκευαστή στιγμιοτύπου του οποίου οι παράμετροι ταιριάζουν με τους τύπους στον καθορισμένο πίνακα. |
| [GetConstructors](./getconstructors/)(System::Reflection::BindingFlags) const | Αναζητά τους κατασκευαστές που ορίζονται για τον τρέχοντα Type, χρησιμοποιώντας τα καθορισμένα BindingFlags. |
| [GetConstructors](./getconstructors/)() const | Επιστρέφει όλους τους δημόσιους κατασκευαστές που ορίζονται για τον τρέχοντα Type. |
| [GetCustomAttribute](./getcustomattribute/)(const TypeInfo\&) const | Αναζητά το προσαρμοσμένο χαρακτηριστικό που έχει τον καθορισμένο τύπο και εφαρμόζεται στον τύπο που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [GetCustomAttributes](./getcustomattributes/)() const | Επιστρέφει έναν πίνακα που περιέχει αντικείμενα που αντιπροσωπεύουν όλα τα προσαρμοσμένα χαρακτηριστικά που εφαρμόζονται στον τύπο. |
| [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&, bool) const | Επιστρέφει έναν πίνακα που περιέχει αντικείμενα που αντιπροσωπεύουν συγκεκριμένα χαρακτηριστικά που εφαρμόζονται στον τύπο. |
| [GetElementType](./getelementtype/)() const | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [GetField](./getfield/)(const System::String\&, System::Reflection::BindingFlags) const | Αναζητά το καθορισμένο πεδίο, χρησιμοποιώντας τους καθορισμένους περιορισμούς σύνδεσης. |
| [GetFields](./getfields/)(System::Reflection::BindingFlags) const | Αναζητά τα πεδία που ορίζονται για τον τρέχοντα Type, χρησιμοποιώντας τους καθορισμένους περιορισμούς σύνδεσης. |
| [GetGenericArguments](./getgenericarguments/)() const | Λαμβάνει έναν πίνακα των γενικών τύπων ορισμάτων για αυτόν τον τύπο. |
| [GetHashCode](./gethashcode/)() const | Επιστρέφει έναν κωδικό κατακερματισμού (hash code) που σχετίζεται με αυτήν την παρουσία. |
| [GetInterfaces](./getinterfaces/)() const | Λαμβάνει όλες τις διεπαφές που υλοποιούνται ή κληρονομούνται από τον τρέχοντα Type. |
| [GetMember](./getmember/)(const String\&) const | Λαμβάνει τη λίστα των μελών με το καθορισμένο όνομα. |
| [GetMethod](./getmethod/)(const String\&) const | Λαμβάνει τη μέθοδο με το καθορισμένο όνομα. |
| [GetProperties](./getproperties/)() const | Επιστρέφει όλες τις δημόσιες ιδιότητες του τρέχοντος Type. |
| [GetProperties](./getproperties/)(System::Reflection::BindingFlags) const | Αναζητά τις ιδιότητες του τρέχοντος Type, χρησιμοποιώντας τους καθορισμένους περιορισμούς σύνδεσης. |
| [GetTemplParamType](./gettemplparamtype/)() const | Λαμβάνει τον περιγραφέα τύπου παραμέτρου προτύπου. |
| [Hash](./hash/)() const | Επιστρέφει μια τιμή hash που σχετίζεται με τον τύπο που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [IsAssignableFrom](./isassignablefrom/)(const TypeInfo\&) const | Καθορίζει εάν ένα στιγμιότυπο ενός καθορισμένου τύπου μπορεί να εκχωρηθεί σε μια μεταβλητή του τρέχοντος τύπου. |
| [IsDefined](./isdefined/)(const TypeInfo\&, bool) const | ΔΕΝ ΕΦΑΡΜΟΣΤΕΙ. Δείχνει εάν ένα ή περισσότερα χαρακτηριστικά του καθορισμένου τύπου ή των παραγώγων του τύπου εφαρμόζονται σε αυτό το μέλος. |
| [IsInstanceOfType](./isinstanceoftype/)(const SharedPtr\<Object\>\&) const | Καθορίζει εάν το καθορισμένο αντικείμενο είναι στιγμιότυπο του τρέχοντος τύπου. |
| [IsSubclassOf](./issubclassof/)(const TypeInfo\&) const | Καθορίζει εάν ο τύπος που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι υποκατηγορία της καθορισμένης κλάσης. |
| [operator!=](./operator!=/)(const TypeInfo\&) const | Καθορίζει εάν τα τρέχοντα και τα καθορισμένα αντικείμενα [TypeInfo](./) δεν είναι ίσα. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Καθορίζει εάν το τρέχον αντικείμενο [TypeInfo](./) δεν είναι αντικείμενο null, δηλαδή αντιπροσωπεύει κάποιο τύπο. |
| [operator==](./operator==/)(const TypeInfo\&) const | Καθορίζει εάν τα τρέχοντα και τα καθορισμένα αντικείμενα [TypeInfo](./) είναι ίσα. |
| [operator==](./operator==/)(std::nullptr_t) const | Καθορίζει εάν το τρέχον αντικείμενο [TypeInfo](./) είναι αντικείμενο null, δηλαδή δεν αντιπροσωπεύει κανέναν τύπο. |
| [reset](./reset/)() | Ορίζει το [TypeInfo](./) σε null. |
| [set_IsValueType](./set_isvaluetype/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν ο Type είναι τύπος τιμής. |
| [SetBaseType](./setbasetype/)(GetTypeInfoFunPtr) | Ορίζει τον περιγραφέα βασικού τύπου. |
| [SetTemplParamType](./settemplparamtype/)(const TypeInfo\&) | Ορίζει τον περιγραφέα τύπου παραμέτρου προτύπου. |
| static [StringHash](./stringhash/)(const char_t *) | Υπολογίζει το hash για τη συγκεκριμένη συμβολοσειρά. |
| [ToString](./tostring/)() const | Επιστρέφει μια συμβολοσειρά που περιέχει το όνομα του τύπου που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| static [Type](./type/)() | Επιστρέφει ένα αντικείμενο [TypeInfo](./) που αντιπροσωπεύει την κλάση [TypeInfo](./). |
| [TypeInfo](./typeinfo/)() | Κατασκευαστής προεπιλογής (δεν έχει οριστεί τύπος). |
| [TypeInfo](./typeinfo/)(std::nullptr_t) | Κατασκευαστής null αντικειμένου (δεν έχει οριστεί τύπος). |
| [TypeInfo](./typeinfo/)(const char_t *) | Κατασκευαστής. |
| [TypeInfo](./typeinfo/)(const char_t *, uint32_t) | Κατασκευαστής. |
| [TypeInfo](./typeinfo/)(const std::type_info\&) | Κατασκευαστής. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [EmptyType](./emptytype/) | Σταθερά που αντιπροσωπεύει κενή λίστα από [TypeInfo](./). |
| static [EmptyTypes](./emptytypes/) | Σταθερά που αντιπροσωπεύει κενή λίστα από [TypeInfo](./). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [DefaultConstructor](./defaultconstructor/) | Δείκτης συνάρτησης για δημιουργία τύπου. |
## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
