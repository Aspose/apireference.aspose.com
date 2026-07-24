---
title: "Aspose::Page::Drawing::Color::FromArgb μέθοδος"
linktitle: "FromArgb"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::Drawing::Color::FromArgb μέθοδος. Δημιουργεί μια δομή T:Aspose::Page::Drawing::Color από τη συγκεκριμένη δομή T:Aspose::Page::Drawing::Color, αλλά με τη νέα καθορισμένη τιμή άλφα. Παρόλο που αυτή η μέθοδος επιτρέπει τη μεταβίβαση μιας 32-bit τιμής για την τιμή άλφα, η τιμή περιορίζεται σε 8 bits σε C++."
type: docs
weight: 100
url: /el/cpp/aspose.page.drawing/color/fromargb/
---
## Color::FromArgb(int32_t, Aspose::Page::Drawing::Color) method


Δημιουργεί μια δομή [T:Aspose::Page::Drawing::Color](../) από τη συγκεκριμένη δομή [T:Aspose::Page::Drawing::Color](../), αλλά με τη νέα καθορισμένη τιμή άλφα. Παρόλο που αυτή η μέθοδος επιτρέπει τη μετάδοση 32-bit τιμής για την τιμή άλφα, η τιμή περιορίζεται σε 8 bits.

```cpp
static Aspose::Page::Drawing::Color Aspose::Page::Drawing::Color::FromArgb(int32_t alpha, Aspose::Page::Drawing::Color baseColor)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| alpha | int32_t | Η τιμή άλφα για το νέο [T:Aspose::Page::Drawing::Color](../). Οι έγκυρες τιμές είναι 0 έως 255. |
| baseColor | Aspose::Page::Drawing::Color | Το [T:Aspose::Page::Drawing::Color](../) από το οποίο θα δημιουργηθεί το νέο [T:Aspose::Page::Drawing::Color](../). |

### ReturnValue

Το [T:Aspose::Page::Drawing::Color](../) που δημιουργεί αυτή η μέθοδος.

## Δείτε επίσης

* Class [Color](../)
* Class [Color](../)
* Namespace [Aspose::Page::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Color::FromArgb(int32_t, int32_t, int32_t, int32_t) method


Δημιουργεί μια δομή [T:Aspose::Page::Drawing::Color](../) από τις τέσσερις τιμές των συστατικών ARGB (άλφα, κόκκινο, πράσινο και μπλε). Παρόλο που αυτή η μέθοδος επιτρέπει τη μετάδοση 32-bit τιμής για κάθε συστατικό, η τιμή κάθε συστατικού περιορίζεται σε 8 bits.

```cpp
static Aspose::Page::Drawing::Color Aspose::Page::Drawing::Color::FromArgb(int32_t alpha, int32_t red, int32_t green, int32_t blue)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| alpha | int32_t | Το συστατικό άλφα. Οι έγκυρες τιμές είναι 0 έως 255. |
| red | int32_t | Το συστατικό κόκκινο. Οι έγκυρες τιμές είναι 0 έως 255. |
| green | int32_t | Το συστατικό πράσινο. Οι έγκυρες τιμές είναι 0 έως 255. |
| μπλε | int32_t | Το συστατικό μπλε. Οι έγκυρες τιμές είναι 0 έως 255. |

### ReturnValue

Το [T:Aspose::Page::Drawing::Color](../) που δημιουργεί αυτή η μέθοδος.

## Δείτε επίσης

* Class [Color](../)
* Class [Color](../)
* Namespace [Aspose::Page::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Color::FromArgb(int32_t) method


Δημιουργεί μια δομή [T:Aspose::Page::Drawing::Color](../) από μια 32-bit τιμή ARGB.

```cpp
static Aspose::Page::Drawing::Color Aspose::Page::Drawing::Color::FromArgb(int32_t argb)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| argb | int32_t | Μια τιμή που καθορίζει την 32-bit τιμή ARGB. |

### ReturnValue

Η δομή [T:Aspose::Page::Drawing::Color](../) που δημιουργεί αυτή η μέθοδος.

## Δείτε επίσης

* Class [Color](../)
* Class [Color](../)
* Namespace [Aspose::Page::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Color::FromArgb(int32_t, int32_t, int32_t) method


Δημιουργεί μια δομή [T:Aspose::Page::Drawing::Color](../) από τις καθορισμένες 8-bit τιμές χρώματος (κόκκινο, πράσινο και μπλε). Η τιμή άλφα είναι έμμεσα 255 (πλήρως αδιαφανής). Παρόλο που αυτή η μέθοδος επιτρέπει τη μετάδοση 32-bit τιμής για κάθε συστατικό χρώματος, η τιμή κάθε συστατικού περιορίζεται σε 8 bits.

```cpp
static Aspose::Page::Drawing::Color Aspose::Page::Drawing::Color::FromArgb(int32_t red, int32_t green, int32_t blue)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| red | int32_t | Η τιμή του κόκκινου συστατικού για το νέο [T:Aspose::Page::Drawing::Color](../). Οι έγκυρες τιμές είναι 0 έως 255. |
| green | int32_t | Η τιμή του πράσινου συστατικού για το νέο [T:Aspose::Page::Drawing::Color](../). Οι έγκυρες τιμές είναι 0 έως 255. |
| blue | int32_t | Η τιμή του μπλε συστατικού για το νέο [T:Aspose::Page::Drawing::Color](../). Οι έγκυρες τιμές είναι 0 έως 255. |

### ReturnValue

Το [T:Aspose::Page::Drawing::Color](../) που δημιουργεί αυτή η μέθοδος.

## Δείτε επίσης

* Class [Color](../)
* Class [Color](../)
* Namespace [Aspose::Page::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
