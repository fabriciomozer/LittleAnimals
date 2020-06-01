package com.mob.littleanimals;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

public class FullscreenActivity extends Activity {

	private ImageButton imageButtonCachorro;
	private ImageButton imageButtonVaca;
	private ImageButton imageButtonPassaro;
	private ImageButton imageButtonGato;
	private ImageButton imageButtonPato;
	private ImageButton imageButtonPorco;
	private ImageButton imageButtonOvelha;
	private ImageButton imageButtonSapo;
	private ImageButton imageButtonCavalo;

	private MediaPlayer birdSound;
	private MediaPlayer catSound;
	private MediaPlayer dogSound;
	private MediaPlayer porcoSound;
	private MediaPlayer vacaSound;
	private	MediaPlayer patoSound;
	private MediaPlayer ovelhaSound;
	private MediaPlayer sapoSound;
	private MediaPlayer cavaloSound;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_fullscreen);
		setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); 

		imageButtonCachorro = (ImageButton) findViewById(R.id.imageButtonCachorro);
		imageButtonVaca = (ImageButton) findViewById(R.id.imageButtonVaca);
		imageButtonPassaro = (ImageButton) findViewById(R.id.imageButtonPassaro);
		imageButtonGato = (ImageButton) findViewById(R.id.imageButtonGato);
		imageButtonPato = (ImageButton) findViewById(R.id.imageButtonPato);
		imageButtonPorco = (ImageButton) findViewById(R.id.imageButtonPorco);
		imageButtonOvelha = (ImageButton) findViewById(R.id.imageButtonOvelha);
		imageButtonSapo = (ImageButton) findViewById(R.id.imageButtonSapo);
		imageButtonCavalo = (ImageButton) findViewById(R.id.imageButtonCavalo);

		birdSound = MediaPlayer.create(FullscreenActivity.this,R.raw.birdsongs);
		catSound = MediaPlayer.create(FullscreenActivity.this,R.raw.catsound);
		dogSound = MediaPlayer.create(FullscreenActivity.this,R.raw.dogsound);
		porcoSound = MediaPlayer.create(FullscreenActivity.this,R.raw.porcosound);
		vacaSound = MediaPlayer.create(FullscreenActivity.this,R.raw.vacasound);
		patoSound = MediaPlayer.create(FullscreenActivity.this,R.raw.patosound);
		ovelhaSound = MediaPlayer.create(FullscreenActivity.this,R.raw.ovelhasound);
		sapoSound = MediaPlayer.create(FullscreenActivity.this,R.raw.saposound);
		cavaloSound = MediaPlayer.create(FullscreenActivity.this,R.raw.cavalosound);

		imageButtonPassaro.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {

				if(event.getAction() == MotionEvent.ACTION_DOWN){
					verificaSomTocando();
				}

				mudarImagenTocarSomOnTouch(imageButtonPassaro, birdSound, v, event);
				return false;
			}
		});

		imageButtonCachorro.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {

				if(event.getAction() == MotionEvent.ACTION_DOWN){
					verificaSomTocando();
				}

				mudarImagenTocarSomOnTouch(imageButtonCachorro, dogSound, v, event);
				return false;
			}
		});

		imageButtonGato.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {

				if(event.getAction() == MotionEvent.ACTION_DOWN){
					verificaSomTocando();
				}

				mudarImagenTocarSomOnTouch(imageButtonGato, catSound, v, event);
				return false;
			}
		});

		imageButtonVaca.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {

				if(event.getAction() == MotionEvent.ACTION_DOWN){
					verificaSomTocando();
				}

				mudarImagenTocarSomOnTouch(imageButtonVaca, vacaSound, v, event);
				return false;
			}
		});      

		imageButtonPato.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {

				if(event.getAction() == MotionEvent.ACTION_DOWN){
					verificaSomTocando();
				}

				mudarImagenTocarSomOnTouch(imageButtonPato, patoSound, v, event);
				return false;
			}
		});

		imageButtonPorco.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {

				if(event.getAction() == MotionEvent.ACTION_DOWN){
					verificaSomTocando();
				}

				mudarImagenTocarSomOnTouch(imageButtonPorco, porcoSound, v, event);
				return false;
			}
		});

		imageButtonOvelha.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {

				if(event.getAction() == MotionEvent.ACTION_DOWN){
					verificaSomTocando();
				}

				mudarImagenTocarSomOnTouch(imageButtonOvelha, ovelhaSound, v, event);
				return false;
			}
		});

		imageButtonSapo.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {

				if(event.getAction() == MotionEvent.ACTION_DOWN){

					verificaSomTocando();
				}

				mudarImagenTocarSomOnTouch(imageButtonSapo, sapoSound, v, event);
				return false;
			}
		});

		imageButtonCavalo.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {

				if(event.getAction() == MotionEvent.ACTION_DOWN){

					verificaSomTocando();
				}

				mudarImagenTocarSomOnTouch(imageButtonCavalo, cavaloSound, v, event);
				return false;
			}
		});

	}

	private void mudarImagenTocarSomOnTouch(final ImageButton imageButton, final MediaPlayer mPlayer, View v, MotionEvent event) {

		if(imageButton != null && event != null){
			if(event.getAction() == MotionEvent.ACTION_DOWN){
				Log.i("mob-litte-animals","ACTION_DOWN");
				imageButton.setColorFilter(Color.argb(50, 0, 0, 0));
				mPlayer.start();

			}
			if(event.getAction() == MotionEvent.ACTION_UP){

				Log.i("mob-litte-animals","ACTION_UP");
				imageButton.setColorFilter(Color.argb(0, 0, 0, 0));

			}

			if(v != null && event.getAction() == MotionEvent.ACTION_MOVE){
				imageButton.setColorFilter(Color.argb(0, 0, 0, 0));
			}
		}
	}

	private void verificaSomTocando() {

		if(birdSound.isPlaying()) {
			Log.i("mob-litte-animals","birdsongs");
			birdSound.pause();
			birdSound.seekTo(0);
		} 
		if(catSound.isPlaying()) {
			Log.i("mob-litte-animals","catsound");
			catSound.pause();
			catSound.seekTo(0);
		}
		if(dogSound.isPlaying()) {
			Log.i("mob-litte-animals","dogsound");
			dogSound.pause();
			dogSound.seekTo(0);
		}
		if(porcoSound.isPlaying()) {
			Log.i("mob-litte-animals","porcosound");
			porcoSound.pause();
			porcoSound.seekTo(0);
		}
		if(vacaSound.isPlaying()) {
			Log.i("mob-litte-animals","vacasound");
			vacaSound.pause();
			vacaSound.seekTo(0);
		}
		if(patoSound.isPlaying()) {
			Log.i("mob-litte-animals","patosound");
			patoSound.pause();
			patoSound.seekTo(0);
		}
		if(ovelhaSound.isPlaying()) {
			Log.i("mob-litte-animals","ovelhasound");
			ovelhaSound.pause();
			ovelhaSound.seekTo(0);
		}
		if(sapoSound.isPlaying()) {
			Log.i("mob-litte-animals","saposound");
			sapoSound.pause();
			sapoSound.seekTo(0);
		}
		if(cavaloSound.isPlaying()) {
			Log.i("mob-litte-animals","cavalosound");
			cavaloSound.pause();
			cavaloSound.seekTo(0);
		}
	}
}
