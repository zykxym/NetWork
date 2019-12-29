package com.zykxym.laiyun.network;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ChenZhen on 2019/12/29
 */
public class movieTopReq {

    /**
     * request_hash : request:anime:f157e06dac100ed322175f0b868aa2a41c2f7b8c
     * request_cached : true
     * request_cache_expiry : -135181
     * episodes_last_page : 1
     * episodes : [{"episode_id":1,"title":"Asteroid Blues","title_japanese":"アステロイド・ブルース","title_romanji":"Asteroid Blues ","aired":"1998-10-24T00:00:00+00:00","filler":false,"recap":false,"video_url":"https://myanimelist.net/anime/1/Cowboy_Bebop/episode/1","forum_url":"https://myanimelist.net/forum/?topicid=29264"},{"episode_id":2,"title":"Stray Dog Strut","title_japanese":"野良犬のストラット","title_romanji":"Nora Inu no Strut ","aired":"1998-04-03T00:00:00+00:00","filler":false,"recap":false,"video_url":"https://myanimelist.net/anime/1/Cowboy_Bebop/episode/2","forum_url":"https://myanimelist.net/forum/?topicid=29323"},{"episode_id":3,"title":"Honky Tonk Women","title_japanese":"ホンキィ・トンク・ウィメン","title_romanji":"Honky Tonk Women ","aired":"1998-04-10T00:00:00+00:00","filler":false,"recap":false,"video_url":"https://myanimelist.net/anime/1/Cowboy_Bebop/episode/3","forum_url":"https://myanimelist.net/forum/?topicid=29334"},{"episode_id":4,"title":"Gateway Shuffle","title_japanese":"ゲイトウェイ・シャッフル","title_romanji":"Gateway Shuffle ","aired":"1998-11-14T00:00:00+00:00","filler":false,"recap":false,"video_url":"https://myanimelist.net/anime/1/Cowboy_Bebop/episode/4","forum_url":"https://myanimelist.net/forum/?topicid=50217"},{"episode_id":5,"title":"Ballad of Fallen Angels","title_japanese":"堕天使たちのバラッド","title_romanji":"Datenshi-tachi no Ballad ","aired":"1998-11-21T00:00:00+00:00","filler":false,"recap":false,"video_url":"https://myanimelist.net/anime/1/Cowboy_Bebop/episode/5","forum_url":"https://myanimelist.net/forum/?topicid=22879"},{"episode_id":6,"title":"Sympathy for the Devil","title_japanese":"悪魔を憐れむ歌","title_romanji":"Akuma wo Awaremu Uta ","aired":"1998-11-28T00:00:00+00:00","filler":false,"recap":false,"video_url":"https://myanimelist.net/anime/1/Cowboy_Bebop/episode/6","forum_url":"https://myanimelist.net/forum/?topicid=101049"},{"episode_id":7,"title":"Heavy Metal Queen","title_japanese":"ヘヴィ・メタル・クイーン","title_romanji":"Heavy Metal Queen ","aired":"1998-04-17T00:00:00+00:00","filler":false,"recap":false,"video_url":"https://myanimelist.net/anime/1/Cowboy_Bebop/episode/7","forum_url":"https://myanimelist.net/forum/?topicid=101265"},{"episode_id":8,"title":"Waltz for Venus","title_japanese":"ワルツ・フォー・ヴィーナス","title_romanji":"Waltz for Venus ","aired":"1998-04-24T00:00:00+00:00","filler":false,"recap":false,"video_url":"https://myanimelist.net/anime/1/Cowboy_Bebop/episode/8","forum_url":"https://myanimelist.net/forum/?topicid=101271"},{"episode_id":9,"title":"Jamming with Edward","title_japanese":"ジャミング・ウィズ・エドワード","title_romanji":"Jamming with Edward ","aired":"1998-05-01T00:00:00+00:00","filler":false,"recap":false,"video_url":"https://myanimelist.net/anime/1/Cowboy_Bebop/episode/9","forum_url":"https://myanimelist.net/forum/?topicid=101461"},{"episode_id":10,"title":"Ganymede Elegy","title_japanese":"ガニメデ慕情","title_romanji":"Ganymede Bojou ","aired":"1998-05-08T00:00:00+00:00","filler":false,"recap":false,"video_url":"https://myanimelist.net/anime/1/Cowboy_Bebop/episode/10","forum_url":"https://myanimelist.net/forum/?topicid=23465"},{"episode_id":11,"title":"Toys in the Attic","title_japanese":"闇夜のヘヴィ・ロック","title_romanji":"Yamiyo no Heavy Rock ","aired":"1998-05-15T00:00:00+00:00","filler":false,"recap":false,"video_url":"https://myanimelist.net/anime/1/Cowboy_Bebop/episode/11","forum_url":"https://myanimelist.net/forum/?topicid=35320"},{"episode_id":12,"title":"Jupiter Jazz (Part 1)","title_japanese":"ジュピター・ジャズ（前編）","title_romanji":"Jupiter Jazz (Zenpen) ","aired":"1998-05-22T00:00:00+00:00","filler":false,"recap":false,"video_url":"https://myanimelist.net/anime/1/Cowboy_Bebop/episode/12","forum_url":"https://myanimelist.net/forum/?topicid=36204"},{"episode_id":13,"title":"Jupiter Jazz (Part 2)","title_japanese":"ジュピター・ジャズ（後編）","title_romanji":"Jupiter Jazz (Kouhen) ","aired":"1998-05-29T00:00:00+00:00","filler":false,"recap":false,"video_url":"https://myanimelist.net/anime/1/Cowboy_Bebop/episode/13","forum_url":"https://myanimelist.net/forum/?topicid=24084"},{"episode_id":14,"title":"Bohemian Rhapsody","title_japanese":"ボヘミアン・ラプソディ","title_romanji":"Bohemian Rhapsody ","aired":"1998-06-05T00:00:00+00:00","filler":false,"recap":false,"video_url":"https://myanimelist.net/anime/1/Cowboy_Bebop/episode/14","forum_url":"https://myanimelist.net/forum/?topicid=28761"},{"episode_id":15,"title":"My Funny Valentine","title_japanese":"マイ・ファニー・ヴァレンタイン","title_romanji":"My Funny Valentine ","aired":"1998-06-12T00:00:00+00:00","filler":false,"recap":false,"video_url":"https://myanimelist.net/anime/1/Cowboy_Bebop/episode/15","forum_url":"https://myanimelist.net/forum/?topicid=85746"},{"episode_id":16,"title":"Black Dog Serenade","title_japanese":"ブラック・ドッグ・セレナーデ","title_romanji":"Black Dog Serenade ","aired":"1999-02-13T00:00:00+00:00","filler":false,"recap":false,"video_url":"https://myanimelist.net/anime/1/Cowboy_Bebop/episode/16","forum_url":"https://myanimelist.net/forum/?topicid=133101"},{"episode_id":17,"title":"Mushroom Samba","title_japanese":"マッシュルーム・サンバ","title_romanji":"Mushroom Samba ","aired":"1999-02-20T00:00:00+00:00","filler":false,"recap":false,"video_url":"https://myanimelist.net/anime/1/Cowboy_Bebop/episode/17","forum_url":"https://myanimelist.net/forum/?topicid=52861"},{"episode_id":18,"title":"Speak Like a Child","title_japanese":"スピーク・ライク・ア・チャイルド","title_romanji":"Speak Like a Child ","aired":"1998-06-19T00:00:00+00:00","filler":false,"recap":false,"video_url":"https://myanimelist.net/anime/1/Cowboy_Bebop/episode/18","forum_url":"https://myanimelist.net/forum/?topicid=24885"},{"episode_id":19,"title":"Wild Horses","title_japanese":"ワイルド・ホーセス","title_romanji":"Wild Horses ","aired":"1999-03-06T00:00:00+00:00","filler":false,"recap":false,"video_url":"https://myanimelist.net/anime/1/Cowboy_Bebop/episode/19","forum_url":"https://myanimelist.net/forum/?topicid=60625"},{"episode_id":20,"title":"Pierrot le Fou","title_japanese":"道化師の鎮魂歌（レクイエム）","title_romanji":"Doukeshi no Requiem ","aired":"1999-03-13T00:00:00+00:00","filler":false,"recap":false,"video_url":"https://myanimelist.net/anime/1/Cowboy_Bebop/episode/20","forum_url":"https://myanimelist.net/forum/?topicid=40846"},{"episode_id":21,"title":"Boogie Woogie Feng Shui","title_japanese":"ブギ・ウギ・フンシェイ","title_romanji":"Boogie Woogie Feng Shui ","aired":"1999-03-20T00:00:00+00:00","filler":false,"recap":false,"video_url":"https://myanimelist.net/anime/1/Cowboy_Bebop/episode/21","forum_url":"https://myanimelist.net/forum/?topicid=99628"},{"episode_id":22,"title":"Cowboy Funk","title_japanese":"カウボーイ・ファンク","title_romanji":"Cowboy Funk ","aired":"1999-03-27T00:00:00+00:00","filler":false,"recap":false,"video_url":"https://myanimelist.net/anime/1/Cowboy_Bebop/episode/22","forum_url":"https://myanimelist.net/forum/?topicid=62654"},{"episode_id":23,"title":"Brain Scratch","title_japanese":"ブレイン・スクラッチ","title_romanji":"Brain Scratch ","aired":"1999-04-03T00:00:00+00:00","filler":false,"recap":false,"video_url":"https://myanimelist.net/anime/1/Cowboy_Bebop/episode/23","forum_url":"https://myanimelist.net/forum/?topicid=6487"},{"episode_id":24,"title":"Hard Luck Woman","title_japanese":"ハード・ラック・ウーマン","title_romanji":"Hard Luck Woman ","aired":"1999-04-10T00:00:00+00:00","filler":false,"recap":false,"video_url":"https://myanimelist.net/anime/1/Cowboy_Bebop/episode/24","forum_url":"https://myanimelist.net/forum/?topicid=41342"},{"episode_id":25,"title":"The Real Folk Blues (Part 1)","title_japanese":"ザ・リアル・フォークブルース（前編）","title_romanji":"The Real Folk Blues (Zenpen) ","aired":"1999-04-17T00:00:00+00:00","filler":false,"recap":false,"video_url":"https://myanimelist.net/anime/1/Cowboy_Bebop/episode/25","forum_url":"https://myanimelist.net/forum/?topicid=64109"},{"episode_id":26,"title":"The Real Folk Blues (Part 2)","title_japanese":"ザ・リアル・フォークブルース（後編）","title_romanji":"The Real Folk Blues (Kouhen) ","aired":"1999-04-24T00:00:00+00:00","filler":false,"recap":false,"video_url":"https://myanimelist.net/anime/1/Cowboy_Bebop/episode/26","forum_url":"https://myanimelist.net/forum/?topicid=24838"}]
     */

    @SerializedName("request_hash")
    private String requestHash;
    @SerializedName("request_cached")
    private boolean requestCached;
    @SerializedName("request_cache_expiry")
    private int requestCacheExpiry;
    @SerializedName("episodes_last_page")
    private int episodesLastPage;
    @SerializedName("episodes")
    private List<EpisodesBean> episodes;

    public String getRequestHash() {
        return requestHash;
    }

    public void setRequestHash(String requestHash) {
        this.requestHash = requestHash;
    }

    public boolean isRequestCached() {
        return requestCached;
    }

    public void setRequestCached(boolean requestCached) {
        this.requestCached = requestCached;
    }

    public int getRequestCacheExpiry() {
        return requestCacheExpiry;
    }

    public void setRequestCacheExpiry(int requestCacheExpiry) {
        this.requestCacheExpiry = requestCacheExpiry;
    }

    public int getEpisodesLastPage() {
        return episodesLastPage;
    }

    public void setEpisodesLastPage(int episodesLastPage) {
        this.episodesLastPage = episodesLastPage;
    }

    public List<EpisodesBean> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<EpisodesBean> episodes) {
        this.episodes = episodes;
    }

    public static class EpisodesBean {
        /**
         * episode_id : 1
         * title : Asteroid Blues
         * title_japanese : アステロイド・ブルース
         * title_romanji : Asteroid Blues 
         * aired : 1998-10-24T00:00:00+00:00
         * filler : false
         * recap : false
         * video_url : https://myanimelist.net/anime/1/Cowboy_Bebop/episode/1
         * forum_url : https://myanimelist.net/forum/?topicid=29264
         */

        @SerializedName("episode_id")
        private int episodeId;
        @SerializedName("title")
        private String title;
        @SerializedName("title_japanese")
        private String titleJapanese;
        @SerializedName("title_romanji")
        private String titleRomanji;
        @SerializedName("aired")
        private String aired;
        @SerializedName("filler")
        private boolean filler;
        @SerializedName("recap")
        private boolean recap;
        @SerializedName("video_url")
        private String videoUrl;
        @SerializedName("forum_url")
        private String forumUrl;

        public int getEpisodeId() {
            return episodeId;
        }

        public void setEpisodeId(int episodeId) {
            this.episodeId = episodeId;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTitleJapanese() {
            return titleJapanese;
        }

        public void setTitleJapanese(String titleJapanese) {
            this.titleJapanese = titleJapanese;
        }

        public String getTitleRomanji() {
            return titleRomanji;
        }

        public void setTitleRomanji(String titleRomanji) {
            this.titleRomanji = titleRomanji;
        }

        public String getAired() {
            return aired;
        }

        public void setAired(String aired) {
            this.aired = aired;
        }

        public boolean isFiller() {
            return filler;
        }

        public void setFiller(boolean filler) {
            this.filler = filler;
        }

        public boolean isRecap() {
            return recap;
        }

        public void setRecap(boolean recap) {
            this.recap = recap;
        }

        public String getVideoUrl() {
            return videoUrl;
        }

        public void setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
        }

        public String getForumUrl() {
            return forumUrl;
        }

        public void setForumUrl(String forumUrl) {
            this.forumUrl = forumUrl;
        }
    }
}
