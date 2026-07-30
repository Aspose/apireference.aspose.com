---
title: "Metodo System::Drawing::Graphics::MeasureString"
linktitle: "MeasureString"
second_title: "Aspose.Font per C++"
description: "Metodo System::Drawing::Graphics::MeasureString. Restituisce una dimensione della stringa specificata quando disegnata con il font specificato nel formato specificato in C++."
type: docs
weight: 6500
url: /it/cpp/system.drawing/graphics/measurestring/
---
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, int, System::SharedPtr\<StringFormat\> const\&) const method


Restituisce la dimensione della stringa specificata quando viene disegnata con il carattere specificato nel formato specificato.

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, int width, System::SharedPtr<StringFormat> const &stringFormat=nullptr) const
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| str | String const\& | La stringa di cui calcolare la dimensione |
| font | System::SharedPtr\<Font\> const\& | Il font usato per disegnare la stringa |
| larghezza | int | La larghezza massima della stringa |
| stringFormat | System::SharedPtr\<StringFormat\> const\& | Specifica il formato della stringa |

### ReturnValue

Un oggetto [SizeF](../../sizef/) che rappresenta la dimensione della stringa nelle unità di misura specificate dalla proprietà PageUnit dell'oggetto Graphics corrente.

## Vedi anche

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, PointF const\&, System::SharedPtr\<StringFormat\> const\&) const method


Restituisce la dimensione della stringa specificata quando viene disegnata con il carattere specificato nel formato specificato.

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, PointF const &origin=PointF(0, 0), System::SharedPtr<StringFormat> const &stringFormat=nullptr) const
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| str | String const\& | La stringa di cui calcolare la dimensione |
| font | System::SharedPtr\<Font\> const\& | Il font usato per disegnare la stringa |
| origin | PointF const\& | Specifica la posizione dell'angolo superiore sinistro della stringa |
| stringFormat | System::SharedPtr\<StringFormat\> const\& | Specifica il formato della stringa |

### ReturnValue

Un oggetto [SizeF](../../sizef/) che rappresenta la dimensione della stringa nelle unità di misura specificate dalla proprietà PageUnit dell'oggetto Graphics corrente.

## Vedi anche

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [PointF](../../pointf/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&, int\&, int\&) const method


NON IMPLEMENTATO.

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, SizeF const &layoutArea, System::SharedPtr<StringFormat> const &stringFormat, int &charactersFitted, int &linesFilled) const
```


## Vedi anche

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&) const method


Restituisce la dimensione della stringa specificata quando viene disegnata con il carattere specificato nel formato specificato.

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, SizeF const &layoutArea, System::SharedPtr<StringFormat> const &stringFormat=nullptr) const
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| str | String const\& | La stringa di cui calcolare la dimensione |
| font | System::SharedPtr\<Font\> const\& | Il font usato per disegnare la stringa |
| layoutArea | SizeF const\& | L'area di layout massima della stringa |
| stringFormat | System::SharedPtr\<StringFormat\> const\& | Specifica il formato della stringa |

### ReturnValue

Un oggetto [SizeF](../../sizef/) che rappresenta la dimensione della stringa nelle unità di misura specificate dalla proprietà PageUnit dell'oggetto Graphics corrente.

## Vedi anche

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
