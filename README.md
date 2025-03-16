# Movie DB Backend 🎬

Bu proje, kullanıcı ve admin özellikleri barındıran bir **Film Yönetim Sistemi** geliştirmeyi amaçlamaktadır. Kullanıcılar filmleri arayabilir, inceleme bırakabilir, favori listelerini yönetebilirken; adminler ise film, tür ve oyuncu detaylarını yönetebilmektedir.

## 🚀 Özellikler

- **🔑 Kullanıcı Yetkilendirme**: JWT tabanlı kimlik doğrulama
- **👥 Rol Tabanlı Erişim Kontrolü**: Kullanıcılar ve adminler için farklı yetkilendirme seviyeleri
- **🎥 Film Yönetimi**: Filmler, türler ve oyuncuların yönetimi
- **⭐ Kullanıcı Etkileşimi**: Film incelemeleri, puanlama ve takip sistemi
- **📊 Film Öneri Sistemi**: Kullanıcı alışkanlıklarına göre öneriler
- **🔎 Arama ve Filtreleme**: Gelişmiş film arama özellikleri
- **📡 RESTful API Desteği**: Tüm işlemler için REST API desteği

## 📂 Proje Yapısı

```
movie-db-backend/
│── src/
│   ├── main/java/com/movieBackend/
│   │   ├── config/
│   │   ├── controllers/
│   │   ├── dtos/
│   │   ├── entities/
│   │   ├── exception/
│   │   ├── jwt/
│   │   ├── repositories/
│   │   ├── services/
│   │   ├── MovieBackendApplication.java
│   ├── resources/
│   │   ├── application.yml
│── .gitignore
│── pom.xml
│── README.md
```

## 🛠️ Teknolojiler

- **Backend**: Spring Boot, Hibernate, Spring Security, JWT
- **Veritabanı**: PostgreSQL
- **API**: RESTful API
- **Versiyon Kontrol**: Git & GitHub

## 🏗️ Kurulum & Çalıştırma

1. **Projeyi klonlayın**  
   ```sh
   git clone git@github.com:yncrahmet/october-backend-movie-db.git
   cd movie-db-backend
   ```

2. **Gerekli bağımlılıkları yükleyin**  
   ```sh
   mvn clean install
   ```

3. **Veritabanı ayarlarını yapılandırın** (`application.yml` içinde PostgreSQL bilgilerini düzenleyin)

4. **Projeyi çalıştırın**  
   ```sh
   mvn spring-boot:run
   ```

5. **API'leri postman üzerinden test edin** (Varsayılan port: `8080`)  
   ```
   http://localhost:8080/**
   ```

## 🚦 Geliştirme & Git Kullanımı

- **Yeni bir branch oluşturun**  
  ```sh
  git checkout -b yourName/feature-name
  ```
- **Değişiklikleri commitleyin**  
  ```sh
  git commit -m "[TAT-500] - Açıklama"
  ```
- **Branch’i uzak repoya gönderin**  
  ```sh
  git push origin yourName/feature-name
  ```

## 📝 Katkıda Bulunma

Projeye katkıda bulunmak isterseniz, **issue** açabilir veya **pull request** gönderebilirsiniz. 🚀
