---
title: "System::Drawing::Bitmap::Bitmap κατασκευαστής"
linktitle: "Bitmap"
second_title: "Aspose.Page για C++"
description: "System::Drawing::Bitmap::Bitmap κατασκευαστής. Δημιουργεί ένα νέο αντικείμενο Bitmap από την καθορισμένη υπάρχουσα εικόνα σε C++."
type: docs
weight: 100
url: /el/cpp/system.drawing/bitmap/bitmap/
---
## Bitmap::Bitmap(const SharedPtr\<Image\>\&) constructor


Δημιουργεί ένα νέο αντικείμενο [Bitmap](../) από την καθορισμένη υπάρχουσα εικόνα.

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<Image> &original)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| αρχικό | const SharedPtr\<Image\>\& | Η υπάρχουσα εικόνα για τη δημιουργία της εικόνας bitmap |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Image](../../image/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(const SharedPtr\<Image\>\&, const Size\&) constructor


Δημιουργεί ένα νέο αντικείμενο [Bitmap](../) από την καθορισμένη υπάρχουσα εικόνα, κλιμακωμένο στο καθορισμένο μέγεθος.

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<Image> &original, const Size &size)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| αρχικό | const SharedPtr\<Image\>\& | Η υπάρχουσα εικόνα για τη δημιουργία της εικόνας bitmap |
| size | const Size\& | Το μέγεθος της νέας εικόνας |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Image](../../image/)
* Class [Size](../../size/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(const SharedPtr\<Image\>\&, int, int) constructor


Δημιουργεί ένα νέο αντικείμενο [Bitmap](../) από την καθορισμένη υπάρχουσα εικόνα με το πλάτος και το ύψος κλιμακωμένα στις καθορισμένες τιμές.

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<Image> &original, int width, int height)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| αρχικό | const SharedPtr\<Image\>\& | Η υπάρχουσα εικόνα για τη δημιουργία της εικόνας bitmap |
| πλάτος | int | Πλάτος της νέας εικόνας |
| ύψος | int | Ύψος της νέας εικόνας |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Image](../../image/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(const SharedPtr\<System::IO::Stream\>\&, bool) constructor


Δημιουργεί ένα νέο αντικείμενο [Bitmap](../) από τη καθορισμένη ροή.

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<System::IO::Stream> &stream, bool useIcm=false)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ροή | const SharedPtr\<System::IO::Stream\>\& | Ένα ρεύμα που περιέχει δεδομένα εικόνας |
| useIcm | bool | IGNORED |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(const String\&) constructor


Δημιουργεί ένα νέο αντικείμενο [Bitmap](../) από το καθορισμένο αρχείο.

```cpp
System::Drawing::Bitmap::Bitmap(const String &filename)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| filename | const String\& | Ένα όνομα του αρχείου που περιέχει δεδομένα εικόνας |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(const String\&, bool) constructor


Δημιουργεί ένα νέο αντικείμενο [Bitmap](../) από το καθορισμένο αρχείο.

```cpp
System::Drawing::Bitmap::Bitmap(const String &filename, bool useIcm)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| filename | const String\& | Ένα όνομα του αρχείου που περιέχει δεδομένα εικόνας |
| useIcm | bool | IGNORED |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(int, int, Imaging::PixelFormat) constructor


Δημιουργεί ένα νέο αντικείμενο [Bitmap](../) που αντιπροσωπεύει μια εικόνα bitmap με το καθορισμένο πλάτος, ύψος, μορφή pixel και δεδομένα pixel.

```cpp
System::Drawing::Bitmap::Bitmap(int width, int height, Imaging::PixelFormat format=Imaging::PixelFormat::Format32bppArgb)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| πλάτος | int | Το πλάτος της εικόνας |
| ύψος | int | Το ύψος της εικόνας |
| μορφή | Imaging::PixelFormat | Η μορφή pixel της εικόνας |

## Δείτε επίσης

* Enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
