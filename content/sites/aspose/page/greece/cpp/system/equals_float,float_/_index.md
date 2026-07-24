---
title: "System::Equals< float, float > μέθοδος"
linktitle: "Ισούται< float, float >"
second_title: "Aspose.Page για C++"
description: "System::Equals< float, float > μέθοδος. Ειδίκευση για τιμές κινητής υποδιαστολής μονής ακρίβειας. Αν και δύο τιμές NaN κινητής υποδιαστολής ορίζονται από το IEC 60559:1989 να συγκρίνονται πάντα ως διαφορετικές, η σύμβαση για System.Object.Equals απαιτεί ότι οι υπερφορτώσεις πρέπει να ικανοποιούν τις απαιτήσεις ενός τελεστή ισοδυναμίας. Συνεπώς, οι System.Double.Equals και System.Single.Equals επιστρέφουν True όταν συγκρίνονται δύο NaN, ενώ ο τελεστής ισότητας επιστρέφει False σε αυτήν την περίπτωση, όπως απαιτεί το πρότυπο σε C++."
type: docs
weight: 18400
url: /el/cpp/system/equals_float,float_/
---
## System::Equals< float, float > method


Ειδίκευση για τιμές κινητής υποδιαστολής μονής ακρίβειας. Αν και δύο τιμές NaN κινητής υποδιαστολής ορίζονται από το IEC 60559:1989 να συγκρίνονται πάντα ως διαφορετικές, η σύμβαση για [System.Object.Equals](../object/equals/), απαιτεί ότι οι υπερφορτώσεις πρέπει να ικανοποιούν τις απαιτήσεις ενός τελεστή ισοδυναμίας. Συνεπώς, οι System.Double.Equals και System.Single.Equals επιστρέφουν True όταν συγκρίνονται δύο NaN, ενώ ο τελεστής ισότητας επιστρέφει False σε αυτήν την περίπτωση, όπως απαιτεί το πρότυπο.

```cpp
bool System::Equals<float, float>(const float &a, const float &b)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ένα | const float\& | Ο πρώτος συγκριτέος |
| b | const float\& | Ο δεύτερος συγκριτέος |

### ReturnValue

Αληθές εάν και οι δύο τιμές είναι NaN ή είναι ίσες, διαφορετικά - ψευδές

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
