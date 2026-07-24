---
title: "System::Text::Encoding κλάση"
linktitle: "Encoding"
second_title: "Aspose.Page για C++"
description: "System::Text::Encoding κλάση. Υπηρεσίες κωδικοποίησης σε C++."
type: docs
weight: 1600
url: /el/cpp/system.text/encoding/
---
## Encoding class


[Encoding](./) services.

```cpp
class Encoding : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [Clone](./clone/)() | Κλωνοποιεί το αντικείμενο κωδικοποίησης. |
| static [Convert](./convert/)(const EncodingPtr\&, const EncodingPtr\&, const ArrayPtr\<uint8_t\>\&) | Μετατρέπει bytes μεταξύ δύο κωδικοποιήσεων. |
| static [Convert](./convert/)(const EncodingPtr\&, const EncodingPtr\&, const ArrayPtr\<uint8_t\>\&, int, int) | Μετατρέπει bytes μεταξύ δύο κωδικοποιήσεων. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Συγκρίνει κωδικοποιήσεις. |
| static [get_ASCII](./get_ascii/)() | Λαμβάνει την κωδικοποίηση ASCII. |
| static [get_BigEndianUnicode](./get_bigendianunicode/)() | Λαμβάνει το τυπικό αντικείμενο κωδικοποίησης Unicode big-endian. |
| static [get_BigEndianUTF32](./get_bigendianutf32/)() | Λαμβάνει το τυπικό αντικείμενο κωδικοποίησης UTF-32 big-endian. |
| virtual [get_BodyName](./get_bodyname/)() | Λαμβάνει το όνομα κωδικοποίησης συμβατό με το σώμα του mail agent. |
| virtual [get_CodePage](./get_codepage/)() | Λαμβάνει το ID κωδικοσελίδας [Windows](../../system.windows/). |
| [get_DecoderFallback](./get_decoderfallback/)() const | Λαμβάνει το fallback αποκωδικοποιητή. |
| static [get_Default](./get_default/)() | Λαμβάνει την προεπιλεγμένη κωδικοποίηση. |
| [get_EncoderFallback](./get_encoderfallback/)() const | Λαμβάνει το fallback κωδικοποιητή. |
| virtual [get_EncodingName](./get_encodingname/)() | Λαμβάνει το όνομα κωδικοποίησης που είναι αναγνώσιμο από άνθρωπο. |
| virtual [get_HeaderName](./get_headername/)() | Λαμβάνει το όνομα κωδικοποίησης συμβατό με την κεφαλίδα του πράκτορα αλληλογραφίας. |
| virtual [get_IsBrowserDisplay](./get_isbrowserdisplay/)() | Ελέγχει αν η κωδικοποίηση μπορεί να χρησιμοποιηθεί σε πρόγραμμα περιήγησης για την εμφάνιση περιεχομένου. |
| virtual [get_IsBrowserSave](./get_isbrowsersave/)() | Ελέγχει αν η κωδικοποίηση μπορεί να χρησιμοποιηθεί σε πρόγραμμα περιήγησης για την αποθήκευση περιεχομένου. |
| virtual [get_IsMailNewsDisplay](./get_ismailnewsdisplay/)() | Ελέγχει αν η κωδικοποίηση μπορεί να χρησιμοποιηθεί σε πρόγραμμα αλληλογραφίας για την εμφάνιση περιεχομένου. |
| virtual [get_IsMailNewsSave](./get_ismailnewssave/)() | Ελέγχει αν η κωδικοποίηση μπορεί να χρησιμοποιηθεί σε πρόγραμμα αλληλογραφίας για την αποθήκευση περιεχομένου. |
| [get_IsReadOnly](./get_isreadonly/)() | Ελέγχει αν η κωδικοποίηση είναι μόνο για ανάγνωση. |
| virtual [get_IsSingleByte](./get_issinglebyte/)() | Ελέγχει αν η κωδικοποίηση είναι μονό-μπάιτ. |
| static [get_Latin1](./get_latin1/)() | Λαμβάνει την κωδικοποίηση Latin1. ΓΙΑ ΕΣΩΤΕΡΙΚΗ ΧΡΗΣΗ. |
| static [get_Unicode](./get_unicode/)() | Λαμβάνει το τυπικό αντικείμενο κωδικοποίησης Unicode. |
| static [get_UTF32](./get_utf32/)() |  |
| static [get_UTF7](./get_utf7/)() | Λαμβάνει το τυπικό αντικείμενο κωδικοποίησης UTF-7. |
| static [get_UTF8](./get_utf8/)() | Λαμβάνει το τυπικό αντικείμενο κωδικοποίησης UTF-8. |
| static [get_UTF8Unmarked](./get_utf8unmarked/)() | Μόνο εσωτερική, για χρήση από τις βιβλιοθήκες κλάσεων: Ασημείωτη και μη-επαληθευόμενη εισαγωγή. |
| virtual [get_WebName](./get_webname/)() | Λαμβάνει το όνομα κωδικοποίησης συμβατό με το IANA. |
| virtual [get_WindowsCodePage](./get_windowscodepage/)() | Λαμβάνει το ID κωδικοσελίδας [Windows](../../system.windows/). |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | Λάβετε τον αριθμό των χαρακτήρων που απαιτούνται για την κωδικοποίηση ενός buffer χαρακτήρων. |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | Λάβετε τον αριθμό των χαρακτήρων που απαιτούνται για την κωδικοποίηση ενός buffer χαρακτήρων. |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Λάβετε τον αριθμό των χαρακτήρων που απαιτούνται για την κωδικοποίηση ενός buffer χαρακτήρων. |
| virtual [GetByteCount](./getbytecount/)(const String\&) | Λαμβάνει τον αριθμό των χαρακτήρων που απαιτούνται για την κωδικοποίηση μιας συμβολοσειράς. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | Λάβετε τον αριθμό των χαρακτήρων που απαιτούνται για την κωδικοποίηση ενός buffer χαρακτήρων. |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int) | Λάβετε τον αριθμό των χαρακτήρων που απαιτούνται για την κωδικοποίηση ενός buffer χαρακτήρων. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) | Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων. |
| virtual [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) | Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων. |
| virtual [GetBytes](./getbytes/)(const String\&) | Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων. |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων. |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων. |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) | Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | Λάβετε τον αριθμό των χαρακτήρων που απαιτούνται για την αποκωδικοποίηση ενός buffer byte. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | Λάβετε τον αριθμό των χαρακτήρων που απαιτούνται για την αποκωδικοποίηση ενός buffer byte. |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int) | Λάβετε τον αριθμό των χαρακτήρων που απαιτούνται για την αποκωδικοποίηση ενός buffer byte. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | Λάβετε τους χαρακτήρες που προκύπτουν από την αποκωδικοποίηση ενός buffer byte. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | Λάβετε τους χαρακτήρες που προκύπτουν από την αποκωδικοποίηση ενός buffer byte. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | Λάβετε τους χαρακτήρες που προκύπτουν από την αποκωδικοποίηση ενός buffer byte. |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) | Λάβετε τους χαρακτήρες που προκύπτουν από την αποκωδικοποίηση ενός buffer byte. |
| virtual [GetDecoder](./getdecoder/)() | Λάβετε έναν αποκωδικοποιητή που προωθεί αιτήματα σε αυτό το αντικείμενο. |
| virtual [GetEncoder](./getencoder/)() | Λάβετε έναν κωδικοποιητή που προωθεί αιτήματα σε αυτό το αντικείμενο. |
| static [GetEncoding](./getencoding/)(const String\&) | Λαμβάνει κωδικοποίηση με βάση το όνομα. |
| static [GetEncoding](./getencoding/)(int) | Λαμβάνει κωδικοποίηση με βάση τη σελίδα κώδικα. |
| static [GetEncoding](./getencoding/)(int, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) | Λαμβάνει κωδικοποίηση με βάση τη σελίδα κώδικα. |
| static [GetEncoding](./getencoding/)(const String\&, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) | Λαμβάνει κωδικοποίηση με βάση το όνομα. |
| static [GetEncodings](./getencodings/)() | Λαμβάνει τη λίστα των γνωστών κωδικοποιήσεων. |
| [GetHashCode](./gethashcode/)() const override | Δημιουργεί κατακερματισμό της κωδικοποίησης. |
| virtual [GetMaxByteCount](./getmaxbytecount/)(int) | Λαμβάνει τον μέγιστο αριθμό byte που απαιτούνται για την κωδικοποίηση ενός συγκεκριμένου αριθμού χαρακτήρων. |
| virtual [GetMaxCharCount](./getmaxcharcount/)(int) | Λαμβάνει τον μέγιστο αριθμό χαρακτήρων που απαιτούνται για την αποκωδικοποίηση ενός συγκεκριμένου αριθμού byte. |
| virtual [GetPreamble](./getpreamble/)() | Επιστρέφει μια ακολουθία byte που υποδεικνύει την κωδικοποίηση (π.χ. BOM). |
| virtual [GetString](./getstring/)(uint8_t *, int) | Αποκωδικοποιεί ένα buffer από byte σε συμβολοσειρά. |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>) | Αποκωδικοποιεί ένα buffer από byte σε συμβολοσειρά. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&) | Αποκωδικοποιεί ένα buffer από byte σε συμβολοσειρά. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>\&) | Αποκωδικοποιεί ένα buffer από byte σε συμβολοσειρά. |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>, int, int) | Αποκωδικοποιεί ένα buffer από byte σε συμβολοσειρά. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&, int, int) | Αποκωδικοποιεί ένα buffer από byte σε συμβολοσειρά. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>, int, int) | Αποκωδικοποιεί ένα buffer από byte σε συμβολοσειρά. |
| [set_DecoderFallback](./set_decoderfallback/)(const DecoderFallbackPtr\&) | Ορίζει την εναλλακτική αποκωδικοποίησης. |
| [set_EncoderFallback](./set_encoderfallback/)(const EncoderFallbackPtr\&) | Ορίζει την εναλλακτική κωδικοποίησης. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](./default_code_page/) | Προεπιλεγμένη τιμή κωδικοσελίδας. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | RTTI. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
