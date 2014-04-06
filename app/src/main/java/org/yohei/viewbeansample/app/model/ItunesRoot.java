package org.yohei.viewbeansample.app.model;

import java.util.List;

/**
 * Created by maedayouhei on 4/6/14.
 */
public class ItunesRoot {

    private int resultCount;
    private List<ItunesResult> results;

    public int getResultCount() {
        return resultCount;
    }

    public void setResultCount(int resultCount) {
        this.resultCount = resultCount;
    }

    public List<ItunesResult> getResults() {
        return results;
    }

    public void setResults(List<ItunesResult> results) {
        this.results = results;
    }

    public class ItunesResult {
        private String wrapperType;
        private String kind;
        private long artistId;
        private long collectionId;
        private long trackId;
        private String artistName;
        private String collectionName;
        private String trackName;
        private String collectionCensoredName;
        private String trackCensoredName;
        private String artistViewUrl;
        private String collectionViewUrl;
        private String trackViewUrl;
        private String previewUrl;
        private String artworkUrl60;
        private String artworkUrl30;
        private String artworkUrl100;
        private String collectionPrice;
        private String trackPrice;
        private String releaseDate;
        private String collectionExplicitness;
        private String trackExplicitness;
        private int discCount;
        private int discNumber;
        private int trackCount;
        private int trackNumber;
        private int trackTimeMillis;
        private String country;
        private String currency;
        private String primaryGenreName;
        private String radioStationUrl;

        public String getWrapperType() {
            return wrapperType;
        }

        public void setWrapperType(String wrapperType) {
            this.wrapperType = wrapperType;
        }

        public String getKind() {
            return kind;
        }

        public void setKind(String kind) {
            this.kind = kind;
        }

        public long getArtistId() {
            return artistId;
        }

        public void setArtistId(long artistId) {
            this.artistId = artistId;
        }

        public long getCollectionId() {
            return collectionId;
        }

        public void setCollectionId(long collectionId) {
            this.collectionId = collectionId;
        }

        public long getTrackId() {
            return trackId;
        }

        public void setTrackId(long trackId) {
            this.trackId = trackId;
        }

        public String getArtistName() {
            return artistName;
        }

        public void setArtistName(String artistName) {
            this.artistName = artistName;
        }

        public String getCollectionName() {
            return collectionName;
        }

        public void setCollectionName(String collectionName) {
            this.collectionName = collectionName;
        }

        public String getTrackName() {
            return trackName;
        }

        public void setTrackName(String trackName) {
            this.trackName = trackName;
        }

        public String getCollectionCensoredName() {
            return collectionCensoredName;
        }

        public void setCollectionCensoredName(String collectionCensoredName) {
            this.collectionCensoredName = collectionCensoredName;
        }

        public String getTrackCensoredName() {
            return trackCensoredName;
        }

        public void setTrackCensoredName(String trackCensoredName) {
            this.trackCensoredName = trackCensoredName;
        }

        public String getArtistViewUrl() {
            return artistViewUrl;
        }

        public void setArtistViewUrl(String artistViewUrl) {
            this.artistViewUrl = artistViewUrl;
        }

        public String getCollectionViewUrl() {
            return collectionViewUrl;
        }

        public void setCollectionViewUrl(String collectionViewUrl) {
            this.collectionViewUrl = collectionViewUrl;
        }

        public String getTrackViewUrl() {
            return trackViewUrl;
        }

        public void setTrackViewUrl(String trackViewUrl) {
            this.trackViewUrl = trackViewUrl;
        }

        public String getPreviewUrl() {
            return previewUrl;
        }

        public void setPreviewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
        }

        public String getArtworkUrl60() {
            return artworkUrl60;
        }

        public void setArtworkUrl60(String artworkUrl60) {
            this.artworkUrl60 = artworkUrl60;
        }

        public String getArtworkUrl30() {
            return artworkUrl30;
        }

        public void setArtworkUrl30(String artworkUrl30) {
            this.artworkUrl30 = artworkUrl30;
        }

        public String getArtworkUrl100() {
            return artworkUrl100;
        }

        public void setArtworkUrl100(String artworkUrl100) {
            this.artworkUrl100 = artworkUrl100;
        }

        public String getCollectionPrice() {
            return collectionPrice;
        }

        public void setCollectionPrice(String collectionPrice) {
            this.collectionPrice = collectionPrice;
        }

        public String getTrackPrice() {
            return trackPrice;
        }

        public void setTrackPrice(String trackPrice) {
            this.trackPrice = trackPrice;
        }

        public String getReleaseDate() {
            return releaseDate;
        }

        public void setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
        }

        public String getCollectionExplicitness() {
            return collectionExplicitness;
        }

        public void setCollectionExplicitness(String collectionExplicitness) {
            this.collectionExplicitness = collectionExplicitness;
        }

        public String getTrackExplicitness() {
            return trackExplicitness;
        }

        public void setTrackExplicitness(String trackExplicitness) {
            this.trackExplicitness = trackExplicitness;
        }

        public int getDiscCount() {
            return discCount;
        }

        public void setDiscCount(int discCount) {
            this.discCount = discCount;
        }

        public int getDiscNumber() {
            return discNumber;
        }

        public void setDiscNumber(int discNumber) {
            this.discNumber = discNumber;
        }

        public int getTrackCount() {
            return trackCount;
        }

        public void setTrackCount(int trackCount) {
            this.trackCount = trackCount;
        }

        public int getTrackNumber() {
            return trackNumber;
        }

        public void setTrackNumber(int trackNumber) {
            this.trackNumber = trackNumber;
        }

        public int getTrackTimeMillis() {
            return trackTimeMillis;
        }

        public void setTrackTimeMillis(int trackTimeMillis) {
            this.trackTimeMillis = trackTimeMillis;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public String getPrimaryGenreName() {
            return primaryGenreName;
        }

        public void setPrimaryGenreName(String primaryGenreName) {
            this.primaryGenreName = primaryGenreName;
        }

        public String getRadioStationUrl() {
            return radioStationUrl;
        }

        public void setRadioStationUrl(String radioStationUrl) {
            this.radioStationUrl = radioStationUrl;
        }
    }

}
