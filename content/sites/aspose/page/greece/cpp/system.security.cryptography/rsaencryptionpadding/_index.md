---
title: "System::Security::Cryptography::RSAEncryptionPadding class"
linktitle: "RSAEncryptionPadding"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::RSAEncryptionPadding class. Λειτουργία επένδυσης και παράμετροι για κρυπτογράφηση ή αποκρυπτογράφηση RSA σε C++."
type: docs
weight: 3600
url: /el/cpp/system.security.cryptography/rsaencryptionpadding/
---
## RSAEncryptionPadding class


Λειτουργία επένδυσης και παράμετροι για κρυπτογράφηση ή αποκρυπτογράφηση [RSA](../rsa/).

```cpp
class RSAEncryptionPadding : public System::IEquatable<SharedPtr<RSAEncryptionPadding>>
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| static [CreateOaep](./createoaep/)(const HashAlgorithmName\&) | Δημιουργεί το [RSAEncryptionPadding](./) με λειτουργία OAEP και καθορισμένο αλγόριθμο κατακερματισμού. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(SharedPtr\<RSAEncryptionPadding\>) override |  |
| [get_Mode](./get_mode/)() const | Λαμβάνει τη λειτουργία επένδυσης. |
| [get_OaepHashAlgorithm](./get_oaephashalgorithm/)() const | Λαμβάνει τον αλγόριθμο κατακερματισμού που χρησιμοποιείται με OAEP. |
| static [get_OaepSHA1](./get_oaepsha1/)() | Λαμβάνει τη λειτουργία OAEP με αλγόριθμο κατακερματισμού [SHA1](../sha1/). |
| static [get_OaepSHA256](./get_oaepsha256/)() | Λαμβάνει τη λειτουργία OAEP με αλγόριθμο κατακερματισμού [SHA256](../sha256/). |
| static [get_OaepSHA384](./get_oaepsha384/)() | Λαμβάνει τη λειτουργία OAEP με αλγόριθμο κατακερματισμού [SHA384](../sha384/). |
| static [get_OaepSHA512](./get_oaepsha512/)() | Λαμβάνει τη λειτουργία OAEP με αλγόριθμο κατακερματισμού [SHA512](../sha512/). |
| static [get_Pkcs1](./get_pkcs1/)() | Πληροφορίες RTTI. |
| [GetHashCode](./gethashcode/)() const override | Αναλογική μέθοδος του C# [Object.GetHashCode()](../../system/object/gethashcode/). Ενεργοποιεί το hashing προσαρμοσμένων αντικειμένων. |
| [ToString](./tostring/)() const override | Αναλογικό της C# [Object.ToString()](../../system/object/tostring/) μεθόδου. Ενεργοποιεί τη μετατροπή προσαρμοσμένων αντικειμένων σε συμβολοσειρά. |
## Δείτε επίσης

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
