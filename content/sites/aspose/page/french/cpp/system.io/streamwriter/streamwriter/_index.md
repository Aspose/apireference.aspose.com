---
title: "System::IO::StreamWriter::StreamWriter constructeur"
linktitle: "StreamWriter"
second_title: "Aspose.Page pour C++"
description: "System::IO::StreamWriter::StreamWriter constructeur. Construit une instance de l'objet StreamWriter qui écrit des caractères dans le flux sous-jacent spécifié en utilisant l'encodage UTF-8 et un tampon de taille par défaut de 1024 octets en C++."
type: docs
weight: 100
url: /fr/cpp/system.io/streamwriter/streamwriter/
---
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&) constructor


Construit une instance de l'objet [StreamWriter](../) qui écrit des caractères dans le flux sous-jacent spécifié en utilisant l'encodage UTF-8 et un tampon de taille par défaut de 1024 octets.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| flux | const SharedPtr\<Stream\>\& | Le flux sous-jacent vers lequel écrire des caractères |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&, const EncodingPtr\&) constructor


Construit une instance de l'objet [StreamWriter](../) qui écrit des caractères dans le flux sous-jacent spécifié en utilisant le codage spécifié et un tampon d'une taille par défaut de 1024 octets.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream, const EncodingPtr &encoding)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| flux | const SharedPtr\<Stream\>\& | Le flux sous-jacent vers lequel écrire des caractères |
| encoding | const EncodingPtr\& | Le codage à utiliser |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&, const EncodingPtr\&, int, bool) constructor


Construit une instance de l'objet [StreamWriter](../) qui écrit des caractères dans le flux sous-jacent spécifié en utilisant le codage spécifié et un tampon de la taille spécifiée. Un paramètre indique si le flux sous-jacent doit être fermé lorsque l'objet [StreamWriter](../) est libéré.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, int buffer_size, bool leave_open=false)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| flux | const SharedPtr\<Stream\>\& | Le flux sous-jacent vers lequel écrire des caractères |
| encoding | const EncodingPtr\& | Le codage à utiliser |
| buffer_size | int | La taille minimale du tampon en octets |
| leave_open | bool | Spécifie si le flux sous-jacent doit rester ouvert après que l'objet [StreamWriter](../) actuel soit libéré |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const String\&) constructor


Construit une instance de l'objet [StreamWriter](../) qui écrit des caractères dans le fichier spécifié en utilisant le codage UTF-8 et un tampon d'une taille par défaut de 1024 octets.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chemin | const String\& | Le chemin du fichier vers lequel écrire des caractères |

## Voir aussi

* Class [String](../../../system/string/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const String\&, bool, const EncodingPtr\&, int) constructor


Construit une instance de l'objet [StreamWriter](../) qui écrit des caractères dans le fichier spécifié en utilisant le codage et la taille de tampon spécifiés. Un paramètre indique si les données doivent être ajoutées au fichier ou si le fichier doit être écrasé.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path, bool append, const EncodingPtr &encoding, int buffer_size)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chemin | const String\& | Le chemin du fichier vers lequel écrire des caractères |
| append | bool | Spécifie si les données doivent être ajoutées au fichier spécifié (true) ou si le fichier doit être écrasé (false) |
| encoding | const EncodingPtr\& | Le codage à utiliser |
| buffer_size | int | La taille du tampon à utiliser |

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const String\&, bool, const EncodingPtr\&) constructor


Construit une instance de l'objet [StreamWriter](../) qui écrit des caractères dans le fichier spécifié en utilisant le codage spécifié et un tampon d'une taille par défaut de 1024 octets. Un paramètre indique si les données doivent être ajoutées au fichier ou si le fichier doit être écrasé.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path, bool append, const EncodingPtr &encoding=System::Text::Encoding::get_UTF8Unmarked())
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chemin | const String\& | Le chemin du fichier vers lequel écrire des caractères |
| append | bool | Spécifie si les données doivent être ajoutées au fichier spécifié (true) ou si le fichier doit être écrasé (false) |
| encoding | const EncodingPtr\& | Le codage à utiliser |

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
