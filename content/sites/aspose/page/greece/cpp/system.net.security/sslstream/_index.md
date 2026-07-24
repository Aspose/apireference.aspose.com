---
title: "System::Net::Security::SslStream class"
linktitle: "SslStream"
second_title: "Aspose.Page για C++"
description: "System::Net::Security::SslStream class. Μια ροή που χρησιμοποιεί το πρωτόκολλο SSL για την πιστοποίηση του διακομιστή και προαιρετικά του πελάτη σε C++."
type: docs
weight: 200
url: /el/cpp/system.net.security/sslstream/
---
## SslStream class


Μια ροή που χρησιμοποιεί το πρωτόκολλο SSL για την πιστοποίηση του διακομιστή και προαιρετικά του πελάτη.

```cpp
class SslStream : public System::Net::Security::AuthenticatedStream
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [AuthenticateAsClient](./authenticateasclient/)(String) | Πιστοποιεί την πλευρά του πελάτη της σύνδεσης. |
| virtual [AuthenticateAsClient](./authenticateasclient/)(String, System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\>, System::Security::Authentication::SslProtocols, bool) | Πιστοποιεί την πλευρά του πελάτη της σύνδεσης. |
| [BeginRead](./beginread/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | Ξεκινά μια ασύγχρονη λειτουργία ανάγνωσης. |
| [BeginWrite](./beginwrite/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | Ξεκινά μια ασύγχρονη λειτουργία εγγραφής. |
| [Close](./close/)() override | Κλείνει τη ροή. |
| [Dispose](./dispose/)(bool) override | Απελευθερώνει όλους τους πόρους που χρησιμοποιεί το τρέχον αντικείμενο και κλείνει τη ροή. |
| [EndRead](./endread/)(System::SharedPtr\<IAsyncResult\>) override | Περιμένει μέχρι να ολοκληρωθεί η καθορισμένη ασύγχρονη λειτουργία ανάγνωσης. |
| [EndWrite](./endwrite/)(System::SharedPtr\<IAsyncResult\>) override | Τελειώνει μια ασύγχρονη λειτουργία εγγραφής. Περιμένει μέχρι να ολοκληρωθεί η καθορισμένη ασύγχρονη λειτουργία εγγραφής. |
| [Flush](./flush/)() override | Καθαρίζει τις εσωτερικές μνήμες του ρεύματος και γράφει όλα τα δεδομένα που έχουν αποθηκευτεί στην υποκείμενη αποθήκευση. |
| [get_CanRead](./get_canread/)() const override | Καθορίζει εάν η ροή είναι αναγνώσιμη. |
| [get_CanSeek](./get_canseek/)() const override | Καθορίζει αν το ρεύμα υποστηρίζει αναζήτηση. |
| [get_CanTimeout](./get_cantimeout/)() const override | Λαμβάνει μια τιμή που καθορίζει αν το τρέχον ρεύμα μπορεί να λήξει. |
| [get_CanWrite](./get_canwrite/)() const override | Καθορίζει αν το ρεύμα είναι εγγράψιμο. |
| virtual [get_CheckCertRevocationStatus](./get_checkcertrevocationstatus/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν η λίστα ανάκλησης πιστοποιητικών ελέγχεται κατά τη διαδικασία επαλήθευσης του πιστοποιητικού. |
| virtual [get_CipherAlgorithm](./get_cipheralgorithm/)() | Επιστρέφει τον αλγόριθμο κρυπτογράφησης. |
| virtual [get_CipherStrength](./get_cipherstrength/)() | Επιστρέφει τη δύναμη του χρησιμοποιημένου αλγορίθμου κρυπτογράφησης. |
| virtual [get_HashAlgorithm](./get_hashalgorithm/)() | Επιστρέφει τον αλγόριθμο κατακερματισμού. |
| virtual [get_HashStrength](./get_hashstrength/)() | Επιστρέφει τη δύναμη του χρησιμοποιημένου αλγορίθμου κατακερματισμού. |
| [get_IsAuthenticated](./get_isauthenticated/)() const override | Επιστρέφει μια τιμή που υποδεικνύει εάν η πιστοποίηση πέρασε επιτυχώς. |
| [get_IsEncrypted](./get_isencrypted/)() const override | Επιστρέφει μια τιμή που υποδεικνύει εάν τα δεδομένα που αποστέλλονται μέσω αυτής της ροής είναι κρυπτογραφημένα. |
| [get_IsMutuallyAuthenticated](./get_ismutuallyauthenticated/)() const override | Επιστρέφει μια τιμή που υποδεικνύει εάν ένας διακομιστής και ένας πελάτης έχουν πιστοποιηθεί. |
| [get_IsServer](./get_isserver/)() const override | Επιστρέφει μια τιμή που υποδεικνύει εάν η τοπική πλευρά της σύνδεσης είναι ο διακομιστής. |
| [get_IsSigned](./get_issigned/)() const override | Επιστρέφει μια τιμή που υποδεικνύει εάν τα δεδομένα που αποστέλλονται μέσω αυτής της ροής είναι υπογεγραμμένα. |
| virtual [get_KeyExchangeStrength](./get_keyexchangestrength/)() | Επιστρέφει τη δύναμη του χρησιμοποιημένου αλγορίθμου ανταλλαγής κλειδιών. |
| [get_Length](./get_length/)() const override | Επιστρέφει το μήκος του ρεύματος σε bytes. |
| virtual [get_LocalCertificate](./get_localcertificate/)() | Επιστρέφει το πιστοποιητικό που χρησιμοποιείται για την πιστοποίηση του τοπικού άκρου. |
| [get_Position](./get_position/)() const override | Επιστρέφει την τρέχουσα θέση του ρεύματος. |
| [get_ReadTimeout](./get_readtimeout/)() const override | Λαμβάνει μια τιμή, σε χιλιοστά του δευτερολέπτου, που καθορίζει πόσο χρόνο θα προσπαθήσει το ρεύμα να διαβάσει πριν λήξει. |
| virtual [get_RemoteCertificate](./get_remotecertificate/)() | Επιστρέφει το πιστοποιητικό που χρησιμοποιείται για την πιστοποίηση του απομακρυσμένου άκρου. |
| virtual [get_SslProtocol](./get_sslprotocol/)() | Επιστρέφει το πρωτόκολλο SSL. |
| [get_WriteTimeout](./get_writetimeout/)() const override | Λαμβάνει μια τιμή, σε χιλιοστά του δευτερολέπτου, που καθορίζει πόσο χρόνο θα προσπαθήσει η ροή να γράψει πριν λήξει το χρονικό όριο. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Διαβάζει τον καθορισμένο αριθμό byte από τη ροή και τα γράφει στον καθορισμένο πίνακα byte. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Διαβάζει τον καθορισμένο αριθμό byte από τη ροή και τα γράφει στον καθορισμένο πίνακα byte. |
| [Seek](./seek/)(int64_t, IO::SeekOrigin) override | Ορίζει τη θέση της ροής που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [set_Position](./set_position/)(int64_t) override | Ορίζει τη θέση της ροής. |
| [set_ReadTimeout](./set_readtimeout/)(int32_t) override | Ορίζει μια τιμή που καθορίζει αν η τρέχουσα ροή μπορεί να λήξει. |
| [set_WriteTimeout](./set_writetimeout/)(int32_t) override | Ορίζει μια τιμή, σε χιλιοστά του δευτερολέπτου, που καθορίζει πόσο χρόνο θα προσπαθήσει η ροή να διαβάσει πριν λήξει το χρονικό όριο. |
| [SetLength](./setlength/)(int64_t) override | Ορίζει το μήκος της ροής που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>) | Δημιουργεί μια νέα παρουσία. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool) | Δημιουργεί μια νέα παρουσία. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback) | Δημιουργεί μια νέα παρουσία. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback) | Δημιουργεί μια νέα παρουσία. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback, EncryptionPolicy) | Δημιουργεί μια νέα παρουσία. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&) | Γράφει τον καθορισμένο πίνακα byte στη ροή. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Γράφει το καθορισμένο υποεύρος των byte από τον καθορισμένο πίνακα byte στη ροή. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&) | Γράφει τον καθορισμένο πίνακα byte στη ροή. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Γράφει το καθορισμένο υποεύρος των byte από τον καθορισμένο πίνακα byte στη ροή. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [Null](../../system.io/stream/null/) | Μια ροή χωρίς υποκείμενη αποθήκευση. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [AsyncResultType](./asyncresulttype/) | Πληροφορίες RTTI. |
| [StreamImplementationPtr](./streamimplementationptr/) | Τύπος δείκτη προς την υλοποίηση. |
## Δείτε επίσης

* Class [AuthenticatedStream](../authenticatedstream/)
* Namespace [System::Net::Security](../)
* Library [Aspose.Page for C++](../../)
