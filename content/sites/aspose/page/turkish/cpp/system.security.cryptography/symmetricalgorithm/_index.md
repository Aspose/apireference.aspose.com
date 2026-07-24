---
title: "System::Security::Cryptography::SymmetricAlgorithm sınıfı"
linktitle: "SymmetricAlgorithm"
second_title: "Aspose.Page için C++"
description: "System::Security::Cryptography::SymmetricAlgorithm sınıfı. Şifreleme ve deşifreleme için aynı anahtarı kullanan temel sınıf. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 4900
url: /tr/cpp/system.security.cryptography/symmetricalgorithm/
---
## SymmetricAlgorithm class


Şifreleme ve deşifreleme için aynı anahtarı kullanan temel sınıf. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class SymmetricAlgorithm : public virtual System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [Create](./create/)(const String\&) | Algoritma örneği oluşturur. |
| virtual [CreateDecryptor](./createdecryptor/)() | Algoritma nesnesiyle ilişkili parametrelerle bir deşifreleyici oluşturur. |
| virtual [CreateDecryptor](./createdecryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | Açık parametrelerle bir deşifreleyici oluşturur. |
| virtual [CreateEncryptor](./createencryptor/)() | Algoritma nesnesiyle ilişkili parametrelerle bir şifreleyici oluşturur. |
| virtual [CreateEncryptor](./createencryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | Açık parametrelerle bir şifreleyici oluşturur. |
| virtual [GenerateIV](./generateiv/)() | Algoritma için rastgele bir başlangıç değeri üretir. Mevcut olanı (varsa) geçersiz kılar. |
| virtual [GenerateKey](./generatekey/)() | Algoritma için rastgele bir anahtar üretir. Mevcut olanı (varsa) geçersiz kılar. |
| virtual [get_BlockSize](./get_blocksize/)() | Kriptografik işlemin blok boyutunu alır. |
| virtual [get_FeedbackSize](./get_feedbacksize/)() | Kriptografik işlemin geri bildirim (feedback) boyutunu alır. |
| virtual [get_IV](./get_iv/)() | Kriptografik işlemin başlangıç değerini alır. Henüz oluşturulmadıysa yeni bir değer oluşturur. |
| virtual [get_Key](./get_key/)() | Kriptografik işlemin anahtarını alır. Henüz oluşturulmadıysa yeni bir anahtar oluşturur. |
| virtual [get_KeySize](./get_keysize/)() | Kriptografik işlemin anahtar boyutunu alır. |
| virtual [get_Mode](./get_mode/)() | Kriptografik işlemin modunu alır. |
| virtual [get_Padding](./get_padding/)() | Kriptografik işlemin doldurmasını (padding) alır. |
| virtual [set_BlockSize](./set_blocksize/)(int) | Kriptografik işlemin blok boyutunu ayarlar. |
| virtual [set_FeedbackSize](./set_feedbacksize/)(int) | Kriptografik işlemin geri bildirim (feedback) boyutunu ayarlar. |
| virtual [set_IV](./set_iv/)(System::ArrayPtr\<uint8_t\>) | Kriptografik işlemin başlangıç değerini ayarlar. |
| virtual [set_Key](./set_key/)(System::ArrayPtr\<uint8_t\>) | Kriptografik işlemin anahtarını ayarlar. |
| virtual [set_KeySize](./set_keysize/)(int) | Kriptografik işlemin anahtar boyutunu ayarlar. |
| virtual [set_Mode](./set_mode/)(CipherMode) | Kriptografik işlemin modunu ayarlar. |
| virtual [set_Padding](./set_padding/)(PaddingMode) | Kriptografik işlemin dolgu değerini ayarlar. |
| [ValidKeySize](./validkeysize/)(int) | Anahtar boyutunun geçerli olup olmadığını denetler. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
