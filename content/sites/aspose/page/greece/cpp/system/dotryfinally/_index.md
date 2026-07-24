---
title: "System::DoTryFinally μέθοδος"
linktitle: "DoTryFinally"
second_title: "Aspose.Page για C++"
description: "System::DoTryFinally μέθοδος. Η μοναδική λειτουργία που προσομοιώνει τη συμπεριφορά της δήλωσης try[-catch]-finally της C#''s. Κατά τη μετάφραση της δήλωσης try[-catch]-finally της C#''s με την επιλογή translator''s finally_statement_as_lambda ορισμένη σε true, η δήλωση μεταφράζεται σε κλήση αυτής της μεθόδου σε C++."
type: docs
weight: 16500
url: /el/cpp/system/dotryfinally/
---
## System::DoTryFinally(T\&&, F\&&) method


Η μοναδική λειτουργία που προσομοιώνει τη συμπεριφορά της δήλωσης try[-catch]-finally της C#'s. Κατά τη μετάφραση της δήλωσης try[-catch]-finally της C#'s με την επιλογή translator's finally_statement_as_lambda ορισμένη σε true, η δήλωση μεταφράζεται σε κλήση αυτής της μεθόδου.

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_void_void<T>::value> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Ο τύπος του αντικειμένου συνάρτησης που υλοποιεί το τμήμα try[-catch] της δήλωσης try[-catch]-finally που προσομοιώνεται |
| F | Ο τύπος του αντικειμένου συνάρτησης που υλοποιεί το τμήμα finally της δήλωσης try[-catch]-finally που προσομοιώνεται |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| tryBlock | T\&& | Το αντικείμενο συνάρτησης του οποίου το σώμα περιέχει την υλοποίηση του τμήματος try[-catch] της δήλωσης try[-catch]-finally που προσομοιώνεται |
| finallyBlock | F\&& | Το αντικείμενο συνάρτησης του οποίου το σώμα περιέχει την υλοποίηση του τμήματος finally της δήλωσης try[-catch]-finally που προσομοιώνεται |

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DoTryFinally(T\&&, F\&&) method


Η μοναδική λειτουργία που προσομοιώνει τη συμπεριφορά της δήλωσης try[-catch]-finally της C#'s. Κατά τη μετάφραση της δήλωσης try[-catch]-finally της C#'s με την επιλογή translator's finally_statement_as_lambda ορισμένη σε true, η δήλωση μεταφράζεται σε κλήση αυτής της μεθόδου. Αυτή η υπερφόρτωση διαχειρίζεται την περίπτωση όπου η τιμή επιστροφής του αντικειμένου συνάρτησης που υλοποιεί το τμήμα try[-catch] της δήλωσης try[-catch]-finally είναι bool.

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_void_boolref<T>::value, bool> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Ο τύπος του αντικειμένου συνάρτησης που υλοποιεί το τμήμα try[-catch] της δήλωσης try[-catch]-finally που προσομοιώνεται |
| F | Ο τύπος του αντικειμένου συνάρτησης που υλοποιεί το τμήμα finally της δήλωσης try[-catch]-finally που προσομοιώνεται |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| tryBlock | T\&& | Το αντικείμενο συνάρτησης του οποίου το σώμα περιέχει την υλοποίηση του τμήματος try[-catch] της δήλωσης try[-catch]-finally που προσομοιώνεται |
| finallyBlock | F\&& | Το αντικείμενο συνάρτησης του οποίου το σώμα περιέχει την υλοποίηση του τμήματος finally της δήλωσης try[-catch]-finally που προσομοιώνεται |

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DoTryFinally(T\&&, F\&&) method


Η μοναδική λειτουργία που προσομοιώνει τη συμπεριφορά της δήλωσης try[-catch]-finally της C#. Κατά τη μετάφραση της δήλωσης try[-catch]-finally της C# με την επιλογή του μεταφραστή finally_statement_as_lambda ορισμένη σε true, η δήλωση μεταφράζεται σε κλήση αυτής της μεθόδου. Αυτό το υπερφορτωμένο χειρίζεται την περίπτωση όπου η τιμή επιστροφής του αντικειμένου συνάρτησης που υλοποιεί το τμήμα try[-catch] της δήλωσης try[-catch]-finally είναι bool&.

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_nonovoid_boolref<T>::value, std::optional<Details::ResultOf<T, bool &>>> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Ο τύπος του αντικειμένου συνάρτησης που υλοποιεί το τμήμα try[-catch] της δήλωσης try[-catch]-finally που προσομοιώνεται |
| F | Ο τύπος του αντικειμένου συνάρτησης που υλοποιεί το τμήμα finally της δήλωσης try[-catch]-finally που προσομοιώνεται |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| tryBlock | T\&& | Το αντικείμενο συνάρτησης του οποίου το σώμα περιέχει την υλοποίηση του τμήματος try[-catch] της δήλωσης try[-catch]-finally που προσομοιώνεται |
| finallyBlock | F\&& | Το αντικείμενο συνάρτησης του οποίου το σώμα περιέχει την υλοποίηση του τμήματος finally της δήλωσης try[-catch]-finally που προσομοιώνεται |

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
