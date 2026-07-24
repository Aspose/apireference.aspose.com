---
title: "System::Reflection χώρος ονομάτων"
linktitle: "System::Reflection"
second_title: "Aspose.Page για C++"
description: "Πώς να χρησιμοποιήσετε τον χώρο ονομάτων System::Reflection σε C++."
type: docs
weight: 4900
url: /el/cpp/system.reflection/
---



## Κλάσεις

| Κλάση | Περιγραφή |
| --- | --- |
| [Assembly](./assembly/) | [Reflection](./) κλάση που περιγράφει το assembly. Η υποστήριξη είναι περιορισμένη καθώς οι κανόνες διαφέρουν σημαντικά μεταξύ C# και C++. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../system/makeobject/). Ποτέ μην δημιουργείτε αντικείμενο αυτού του τύπου στο στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assert. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη [System::SmartPtr](../system/smartptr/) και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα. |
| [AssemblyName](./assemblyname/) | Ορίζει το όνομα του assembly. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../system/makeobject/). Ποτέ μην δημιουργείτε αντικείμενο αυτού του τύπου στο στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assert. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη [System::SmartPtr](../system/smartptr/) και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα. |
| [AssemblyTypeRegistration](./assemblytyperegistration/) | Singleton για την καταχώριση τύπου στο εκτελούμενο assembly. |
| [AssemblyTypeRegistrationBase](./assemblytyperegistrationbase/) | Βασικός τύπος για singletons για την καταχώριση τύπου στο εκτελούμενο assembly. |
| [ConstructorInfo](./constructorinfo/) | Παρέχει πρόσβαση στα μεταδεδομένα του κατασκευαστή. |
| [FieldInfo](./fieldinfo/) | Ανακαλύπτει τα χαρακτηριστικά ενός πεδίου και παρέχει πρόσβαση στα μεταδεδομένα του πεδίου. |
| [MemberInfo](./memberinfo/) | Παρέχει πληροφορίες reflection για μέλη. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../system/makeobject/). Ποτέ μην δημιουργείτε αντικείμενο αυτού του τύπου στο στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assert. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη [System::SmartPtr](../system/smartptr/) και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα. |
| [MethodBase](./methodbase/) | Βασικές πληροφορίες για μέθοδο. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../system/makeobject/). Ποτέ μην δημιουργείτε αντικείμενο αυτού του τύπου στο στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assert. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη [System::SmartPtr](../system/smartptr/) και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα. |
| [MethodInfo](./methodinfo/) | Αναπαριστά πληροφορίες για μέθοδο κλάσης. |
| [PropertyInfo](./propertyinfo/) | Αναπαριστά πληροφορίες ιδιότητας. |
## Enums

| Απαρίθμηση | Περιγραφή |
| --- | --- |
| [BindingFlags](./bindingflags/) | Ορίζει μέλη και τρόπους αναζήτησης τύπων και δεσμεύσεων. |
| [FieldAttributes](./fieldattributes/) | Ανακλώμενα χαρακτηριστικά πεδίου. |
| [MemberTypes](./membertypes/) | Σημαδεύει κάθε τύπο μέλους. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [ReflectionTypeLoadException](./reflectiontypeloadexception/) | [ReflectionTypeLoadException](./reflectiontypeloadexception/) ρίχνεται από τη μέθοδο Module.GetTypes εάν κάποια από τις κλάσεις σε ένα module αποτύχει να φορτωθεί. Ποτέ μην τυλίγετε τις περιπτώσεις της κλάσης [ReflectionTypeLoadException](./reflectiontypeloadexception/) σε [System::SmartPtr](../system/smartptr/). |
| [TargetInvocationException](./targetinvocationexception/) | [TargetInvocationException](./targetinvocationexception/) ρίχνεται από μεθόδους που κλήθηκαν μέσω reflection. Ποτέ μην τυλίγετε τις περιπτώσεις της κλάσης [TargetInvocationException](./targetinvocationexception/) σε [System::SmartPtr](../system/smartptr/). |
